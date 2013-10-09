/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accuweaver.unfuddle;

import java.util.Calendar;
import java.util.List;

/**
 *
 * <project>
 * <account-id type="integer"> </account-id>
 * <archived type="boolean"> [true, false] </archived>
 * <assignee-on-resolve> [reporter, none, nochange] </assignee-on-resolve>
 * <backupFrequency type="integer">0</backupFrequency>
 * <closeTicket-simultaneouslyDefault type="boolean"> [true, false]
 * </closeTicket-simultaneouslyDefault>
 * <created-at type="datetime"> </created-at>
 * <defaultTicket-report-id type="integer"> </defaultTicket-report-id>
 * <description> </description>
 * <disk-usage type="integer"> <!-- in Kilobytes --> </disk-usage>
 * <enableTimeTracking type="boolean"> [true, false] </enableTimeTracking>
 * <id type="integer"> </id>
 * <s3-access-key-id></s3-access-key-id>
 * <s3-backup-enabled type="boolean">false</s3-backup-enabled>
 * <s3-bucket-name></s3-bucket-name>
 * <short-name> </short-name>
 * <!-- Custom statuses inclusion is still experimental -->
 * <statuses type="array">
 * <status>
 * <name> </name>
 * <color> </name>
 * <id> </id>
 * </status>
 * ...
 * </statuses>
 * <theme> [blue, green, grey, orange, purple, red, teal] </theme>
 * <ticketField1-active type="boolean"> [true, false] </ticketField1-active>
 * <ticketField1Title> </ticketField1Title>
 * <ticketField1Disposition> [list, text] </ticketField1Disposition>
 * <ticketField2-active type="boolean"> [true, false] </ticketField2-active>
 * <ticketField2Title> </ticketField2Title>
 * <ticketField2Disposition> [list, text] </ticketField2Disposition>
 * <ticketField3-active type="boolean"> [true, false] </ticketField3-active>
 * <ticketField3Title> </ticketField3Title>
 * <ticketField3Disposition> [list, text] </ticketField3Disposition>
 * <title> </title>
 * <updated-at type="datetime"> </updated-at>
 * </project>
 *
 * @author robweaver
 */
public class Project {
    private Integer accountId;
  private boolean archived;
  private String assigneeOnResolve; // [reporter, none, nochange
  private Integer backupFrequency;
  private boolean closeTicketSimultaneouslyDefault;
  private Calendar createdAt;
      private Integer defaultTicketReportId;
  private String description;
  private Integer diskUsage;
  private boolean enableTimeTracking;
  private Integer id;
  private String s3AccessKeyId;
  private boolean s3BackupEnabled;
  private String s3BucketName;
  private String shortName;
  /** -- Custom statuses inclusion is still experimental -- */
  private List<Status> statuses;
 
  private String theme; // [blue, green, grey, orange, purple, red, teal] 
  private boolean ticketField1Active;
  private String ticketField1Title;
  private String ticketField1Disposition; // [list, text]
  private boolean ticketField2Active;
  private String ticketField2Title;
  private String ticketField2Disposition;
  private boolean ticketField3Active;
  private String ticketField3Title;
  private String ticketField3Disposition;
  private String title;
  private Calendar updatedAt;

    /**
     * @return the accountId
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * @param accountId the accountId to set
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * @return the archived
     */
    public boolean isArchived() {
        return archived;
    }

    /**
     * @param archived the archived to set
     */
    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    /**
     * @return the assigneeOnResolve
     */
    public String getAssigneeOnResolve() {
        return assigneeOnResolve;
    }

    /**
     * @param assigneeOnResolve the assigneeOnResolve to set
     */
    public void setAssigneeOnResolve(String assigneeOnResolve) {
        this.assigneeOnResolve = assigneeOnResolve;
    }

    /**
     * @return the backupFrequency
     */
    public Integer getBackupFrequency() {
        return backupFrequency;
    }

    /**
     * @param backupFrequency the backupFrequency to set
     */
    public void setBackupFrequency(Integer backupFrequency) {
        this.backupFrequency = backupFrequency;
    }

    /**
     * @return the closeTicketSimultaneouslyDefault
     */
    public boolean isCloseTicketSimultaneouslyDefault() {
        return closeTicketSimultaneouslyDefault;
    }

    /**
     * @param closeTicketSimultaneouslyDefault the closeTicketSimultaneouslyDefault to set
     */
    public void setCloseTicketSimultaneouslyDefault(boolean closeTicketSimultaneouslyDefault) {
        this.closeTicketSimultaneouslyDefault = closeTicketSimultaneouslyDefault;
    }

    /**
     * @return the createdAt
     */
    public Calendar getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(Calendar createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return the defaultTicketReportId
     */
    public Integer getDefaultTicketReportId() {
        return defaultTicketReportId;
    }

    /**
     * @param defaultTicketReportId the defaultTicketReportId to set
     */
    public void setDefaultTicketReportId(Integer defaultTicketReportId) {
        this.defaultTicketReportId = defaultTicketReportId;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the diskUsage
     */
    public Integer getDiskUsage() {
        return diskUsage;
    }

    /**
     * @param diskUsage the diskUsage to set
     */
    public void setDiskUsage(Integer diskUsage) {
        this.diskUsage = diskUsage;
    }

    /**
     * @return the enableTimeTracking
     */
    public boolean isEnableTimeTracking() {
        return enableTimeTracking;
    }

    /**
     * @param enableTimeTracking the enableTimeTracking to set
     */
    public void setEnableTimeTracking(boolean enableTimeTracking) {
        this.enableTimeTracking = enableTimeTracking;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the s3AccessKeyId
     */
    public String getS3AccessKeyId() {
        return s3AccessKeyId;
    }

    /**
     * @param s3AccessKeyId the s3AccessKeyId to set
     */
    public void setS3AccessKeyId(String s3AccessKeyId) {
        this.s3AccessKeyId = s3AccessKeyId;
    }

    /**
     * @return the s3BackupEnabled
     */
    public boolean isS3BackupEnabled() {
        return s3BackupEnabled;
    }

    /**
     * @param s3BackupEnabled the s3BackupEnabled to set
     */
    public void setS3BackupEnabled(boolean s3BackupEnabled) {
        this.s3BackupEnabled = s3BackupEnabled;
    }

    /**
     * @return the s3BucketName
     */
    public String getS3BucketName() {
        return s3BucketName;
    }

    /**
     * @param s3BucketName the s3BucketName to set
     */
    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * @return the shortName
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * @param shortName the shortName to set
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * @return the statuses
     */
    public List<Status> getStatuses() {
        return statuses;
    }

    /**
     * @param statuses the statuses to set
     */
    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    /**
     * @return the theme
     */
    public String getTheme() {
        return theme;
    }

    /**
     * @param theme the theme to set
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * @return the ticketField1Active
     */
    public boolean isTicketField1Active() {
        return ticketField1Active;
    }

    /**
     * @param ticketField1Active the ticketField1Active to set
     */
    public void setTicketField1Active(boolean ticketField1Active) {
        this.ticketField1Active = ticketField1Active;
    }

    /**
     * @return the ticketField1Title
     */
    public String getTicketField1Title() {
        return ticketField1Title;
    }

    /**
     * @param ticketField1Title the ticketField1Title to set
     */
    public void setTicketField1Title(String ticketField1Title) {
        this.ticketField1Title = ticketField1Title;
    }

    /**
     * @return the ticketField1Disposition
     */
    public String getTicketField1Disposition() {
        return ticketField1Disposition;
    }

    /**
     * @param ticketField1Disposition the ticketField1Disposition to set
     */
    public void setTicketField1Disposition(String ticketField1Disposition) {
        this.ticketField1Disposition = ticketField1Disposition;
    }

    /**
     * @return the ticketField2Active
     */
    public boolean isTicketField2Active() {
        return ticketField2Active;
    }

    /**
     * @param ticketField2Active the ticketField2Active to set
     */
    public void setTicketField2Active(boolean ticketField2Active) {
        this.ticketField2Active = ticketField2Active;
    }

    /**
     * @return the ticketField2Title
     */
    public String getTicketField2Title() {
        return ticketField2Title;
    }

    /**
     * @param ticketField2Title the ticketField2Title to set
     */
    public void setTicketField2Title(String ticketField2Title) {
        this.ticketField2Title = ticketField2Title;
    }

    /**
     * @return the ticketField2Disposition
     */
    public String getTicketField2Disposition() {
        return ticketField2Disposition;
    }

    /**
     * @param ticketField2Disposition the ticketField2Disposition to set
     */
    public void setTicketField2Disposition(String ticketField2Disposition) {
        this.ticketField2Disposition = ticketField2Disposition;
    }

    /**
     * @return the ticketField3Active
     */
    public boolean isTicketField3Active() {
        return ticketField3Active;
    }

    /**
     * @param ticketField3Active the ticketField3Active to set
     */
    public void setTicketField3Active(boolean ticketField3Active) {
        this.ticketField3Active = ticketField3Active;
    }

    /**
     * @return the ticketField3Title
     */
    public String getTicketField3Title() {
        return ticketField3Title;
    }

    /**
     * @param ticketField3Title the ticketField3Title to set
     */
    public void setTicketField3Title(String ticketField3Title) {
        this.ticketField3Title = ticketField3Title;
    }

    /**
     * @return the ticketField3Disposition
     */
    public String getTicketField3Disposition() {
        return ticketField3Disposition;
    }

    /**
     * @param ticketField3Disposition the ticketField3Disposition to set
     */
    public void setTicketField3Disposition(String ticketField3Disposition) {
        this.ticketField3Disposition = ticketField3Disposition;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the updatedAt
     */
    public Calendar getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt the updatedAt to set
     */
    public void setUpdatedAt(Calendar updatedAt) {
        this.updatedAt = updatedAt;
    }

}
