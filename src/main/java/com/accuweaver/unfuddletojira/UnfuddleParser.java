package com.accuweaver.unfuddletojira;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.MalformedInputException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.codec.binary.Base64;

/**
 * Application class
 *
 */
public class UnfuddleParser {

    public static final String OMNIS_API = "https://omnistools.unfuddle.com/api/v1";
    public static final String OMNIS_PROJECTS_API = OMNIS_API + "/projects/";
    private final static Charset ENCODING = StandardCharsets.UTF_8;
    private final static String DIR_NAME = "/Users/robweaver/Downloads/";

    /**
     * Main method for executing from command line ...
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        UnfuddleParser app = new UnfuddleParser();
        String xmlString = app.getProjects();
        //System.out.println(xmlString);
        app.writeSmallTextFile(xmlString, DIR_NAME + "output.xml");
        System.out.println(app.parseIds(xmlString));
        System.out.println(app.parseShortNames(xmlString));
        System.out.println(app.parseDescriptions(xmlString));
    }

    public String getProjects() {
        return readUrl(OMNIS_PROJECTS_API);
    }

    /**
     * Get a list of project ID's
     *
     * @return
     */
    public List<String> getProjectIds() {
        return parseIds(getProjects());

    }

    /**
     * Pull a list of project ID's from a string ...
     *
     * @param inputString
     * @return
     */
    public List<String> parseIds(String inputString) {
        return parse(inputString, "id");
    }

    public List<String> parseShortNames(String inputString) {
        return parse(inputString, "short-name");
    }

    public List<String> parseDescriptions(String inputString) {
        return parse(inputString, "description");
    }

    /**
     * Parse a list out of a string.
     *
     * @param inputString
     * @param elementName
     * @return
     */
    public List<String> parse(String inputString, String elementName) {
        List<String> result = new ArrayList<>();
        Pattern p = Pattern.compile("<"     // Look for the begin of tag
                + elementName               // element name
                + "(\\w*\\s*([^\\>]+))?"      // Any characters in the begin tag
                + ">"                       // End of the tag
                + "([^</]+)"                // The stuff before the closing tag
                + "</"                      // The closing tag
                + elementName               // Element name again
                + ">"                       // End of the closing tag
                , Pattern.CASE_INSENSITIVE | Pattern.DOTALL | Pattern.MULTILINE);
        Matcher m = p.matcher(inputString);

        while (m.find()) {
            
            result.add(m.group(m.groupCount()));
        }

        return result;
    }

    /**
     * Read the URL and return a string ...
     *
     * @param urlString
     * @return
     */
    public String readUrl(String urlString) {
        InputStreamReader isr = getUrlStream(urlString);

        int numCharsRead;
        char[] charArray = new char[1024];
        StringBuilder sb = new StringBuilder();
        try {
            while ((numCharsRead = isr.read(charArray)) > 0) {
                sb.append(charArray, 0, numCharsRead);
            }
        } catch (IOException ex) {
            Logger.getLogger(UnfuddleParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sb.toString();
    }

    /**
     * Method to dump the project ...
     *
     * @param id
     * @return
     */
    public String dumpProject(String id) {
        String urlString = OMNIS_PROJECTS_API + id + "/dump";

        return readUrl(urlString);
    }

    /**
     * Get URL from Unfuddle
     *
     * @param urlString
     * @return
     */
    public InputStreamReader getUrlStream(String urlString) {

        String name = "rweaver";
        String password = "ZtIVNR";

        String authString = name + ":" + password;
        byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());
        String authStringEnc = new String(authEncBytes);

        URL url = null;
        try {
            url = new URL(urlString);
        } catch (MalformedURLException ex) {
            Logger.getLogger(UnfuddleParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        URLConnection urlConnection = null;
        try {
            urlConnection = url.openConnection();
        } catch (IOException ex) {
            Logger.getLogger(UnfuddleParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        urlConnection.setRequestProperty("Authorization", "Basic " + authStringEnc);
        InputStream is = null;
        try {
            is = urlConnection.getInputStream();
        } catch (IOException ex) {
            Logger.getLogger(UnfuddleParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new InputStreamReader(is);
    }

    /**
     * Read a text file ...
     *
     * @param aFileName
     * @return
     * @throws IOException
     */
    public List<String> readSmallTextFile(String aFileName) throws IOException {
        Path path = Paths.get(aFileName);
        List<String> returnList = new ArrayList<>();
        try {
            returnList = Files.readAllLines(path, ENCODING);
        } catch (MalformedInputException mie) {
        }
        return returnList;
    }

    /**
     * Write to a text file ...
     *
     * @param aLines
     * @param aFileName
     * @throws IOException
     */
    public void writeSmallTextFile(List<String> aLines, String aFileName) throws IOException {
        Path path = Paths.get(aFileName);
        Files.write(path, aLines, ENCODING);
    }

    /**
     *
     * @param string
     * @param fileName
     * @throws IOException
     */
    public void writeSmallTextFile(String string, String fileName) throws IOException {
        List<String> lines = new ArrayList<String>();
        lines.add(string);
        writeSmallTextFile(lines, fileName);
    }
}
