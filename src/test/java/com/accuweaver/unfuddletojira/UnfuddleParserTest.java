/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accuweaver.unfuddletojira;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author robweaver
 */
public class UnfuddleParserTest extends TestCase {
    
    public UnfuddleParserTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of main method, of class UnfuddleParser.
     */
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        UnfuddleParser.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProjects method, of class UnfuddleParser.
     */
    public void testGetProjects() {
        System.out.println("getProjects");
        UnfuddleParser instance = new UnfuddleParser();
        String expResult = "";
        String result = instance.getProjects();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProjectIds method, of class UnfuddleParser.
     */
    public void testGetProjectIds() {
        System.out.println("getProjectIds");
        UnfuddleParser instance = new UnfuddleParser();
        String[] s = {"2", "3", "1"};
        List<String> expResult = new ArrayList<>(Arrays.asList(s));
        List<String> result = instance.getProjectIds();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of parseIds method, of class UnfuddleParser.
     */
    public void testParseIds() {
        System.out.println("parseIds");
        String inputString = "<test>"
                + "<id foo=\"bar\">"
                + "232"
                + "</id>"
                + "<id>"
                + "2"
                + "</id>"
                + "<id type=\"integer\">"
                + "3"
                + "</id>";
        UnfuddleParser instance = new UnfuddleParser();
        String[] s = {"232", "2", "3"};
        List<String> expResult = new ArrayList<>(Arrays.asList(s));
        List<String> result = instance.parseIds(inputString);
        assertEquals(expResult, result);
    }

    /**
     * Test of parseShortNames method, of class UnfuddleParser.
     */
    public void testParseShortNames() {
        System.out.println("parseShortNames");
        String inputString = "<short-name>test1</short-name>"
                + "<short-name foo=\"bar\">test2</short-name>\n"
                + "<short-name>test3</short-name>";
        String[] s = {"test1", "test2", "test3" };
        UnfuddleParser instance = new UnfuddleParser();
        List expResult = new ArrayList<>(Arrays.asList(s));
        List result = instance.parseShortNames(inputString);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of parseDescriptions method, of class UnfuddleParser.
     */
    public void testParseDescriptions() {
        System.out.println("parseDescriptions");
        String inputString = "<description>Test \n"
                + "this</description>\n"
                + "<description>second</desription>";
        String[] s = {"Test \nthis", "second"};
        UnfuddleParser instance = new UnfuddleParser();
        List expResult = new ArrayList<>(Arrays.asList(s));
        List result = instance.parseDescriptions(inputString);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of parse method, of class UnfuddleParser.
     */
    public void testParse() {
        System.out.println("parse");
        String inputString = "<id>test</id><id 2>test</id>";
        String[] s = {"test", "test"};
        String startString = "id";
        UnfuddleParser instance = new UnfuddleParser();
        List expResult = new ArrayList<>(Arrays.asList(s));
        List result = instance.parse(inputString, startString);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of readUrl method, of class UnfuddleParser.
     */
    public void testReadUrl() {
        System.out.println("readUrl");
        String urlString = "";
        UnfuddleParser instance = new UnfuddleParser();
        String expResult = "";
        String result = instance.readUrl(urlString);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dumpProject method, of class UnfuddleParser.
     */
    public void testDumpProject() {
        System.out.println("dumpProject");
        String id = "";
        UnfuddleParser instance = new UnfuddleParser();
        String expResult = "";
        String result = instance.dumpProject(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUrlStream method, of class UnfuddleParser.
     */
    public void testGetUrlStream() {
        System.out.println("getUrlStream");
        String urlString = "";
        UnfuddleParser instance = new UnfuddleParser();
        InputStreamReader expResult = null;
        InputStreamReader result = instance.getUrlStream(urlString);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readSmallTextFile method, of class UnfuddleParser.
     */
    public void testReadSmallTextFile() throws Exception {
        System.out.println("readSmallTextFile");
        String aFileName = "";
        UnfuddleParser instance = new UnfuddleParser();
        List expResult = null;
        List result = instance.readSmallTextFile(aFileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeSmallTextFile method, of class UnfuddleParser.
     */
    public void testWriteSmallTextFile_List_String() throws Exception {
        System.out.println("writeSmallTextFile");
        List<String> aLines = null;
        String aFileName = "";
        UnfuddleParser instance = new UnfuddleParser();
        instance.writeSmallTextFile(aLines, aFileName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeSmallTextFile method, of class UnfuddleParser.
     */
    public void testWriteSmallTextFile_String_String() throws Exception {
        System.out.println("writeSmallTextFile");
        String string = "";
        String fileName = "";
        UnfuddleParser instance = new UnfuddleParser();
        instance.writeSmallTextFile(string, fileName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
