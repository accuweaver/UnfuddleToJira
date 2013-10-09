/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accuweaver.unfuddle;

import java.util.Calendar;

/**
 * <person>
 * <!-- only available for the /api/v1/people/current endpoint -->
 * <access-key> </access-key>
 * <account-id type="integer"> </account-id>
 * <created-at type="datetime"> </created-at>
 * <email> </email>
 * <first-name> </first-name>
 * <id type="integer"> </id>
 * <!-- Within the Person model, setting 'is-administrator' to true will make
 * the person an account administrator. -->
 * <is-administrator type="boolean"> [true, false] </is-administrator>
 * <is-removed type="boolean"> [true, false] </is-removed>
 * <last-name> </last-name>
 * <last-signed-in type="datetime"> </last-signed-in>
 * <last-signed-in-formatted> <!-- only available if formatted=true -->
 * </last-signed-in-formatted>
 * <notification-frequency> [immediate, 30mins, hourly, dailyam, dailypm, never]
 * </notification-frequency>
 * <notification-ignore-self type="boolean"> [true, false]
 * </notification-ignore-self>
 * <notification-last-sent type="datetime"> </notification-last-sent>
 * <notification-scope-messages> [all, none] </notification-scope-messages>
 * <notification-scope-milestones> [all, none] </notification-scope-milestones>
 * <notification-scope-source> [all, none] </notification-scope-source>
 * <notification-scope-tickets> [all, involved, none]
 * </notification-scope-tickets>
 * <show-help-messages type="boolean"> [true, false] </show-help-messages>
 * <text-markup> [markdown, textile, plain] </text-markup>
 * <time-zone> <!-- i.e. "Pacific Time (US & Canada)" --> </time-zone>
 * <updated-at type="datetime"> </updated-at>
 * <!-- The username it is not available for removed people -->
 * <username> </username>
 * </person>
 *
 * @author robweaver
 */
public class Person {
 
    private String accessKey;
    private Integer accountId;
  private Calendar createdAt;
  private String email;
  private String firstName;
  private Integer id;
  /**--
  Within the Person model, setting 'isAdministrator' to true will
  make the person an account administrator.
  */
  private boolean isAdministrator;
  private boolean isRemoved;
  private String lastName;
  private Calendar lastSignedIn;
  private String lastSignedInFormatted; // -- only available if formatted=true
  private String notificationFrequency; // [immediate, 30mins, hourly, dailyam, dailypm, never]
  private boolean notificationIgnoreSelf;
  private String notificationScopeMessages; // [all, none]
  private String notificationScopeMilestones; // [all, none]
  private String notificationScopeSource; // [all, none]
  private String notificationScopeTickets; // [all, involved, none]
  private boolean showHelpMessages;
  private String textMarkup; // [markdown, textile, plain] 
  private String timeZone; // -- i.e. "Pacific Time (US & Canada)" 
  private Calendar updatedAt;
  /** -- The username it is not available for removed people --*/
  private String username;

    /**
     * @return the accessKey
     */
    public String getAccessKey() {
        return accessKey;
    }

    /**
     * @param accessKey the accessKey to set
     */
    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
     * @return the isAdministrator
     */
    public boolean isIsAdministrator() {
        return isAdministrator;
    }

    /**
     * @param isAdministrator the isAdministrator to set
     */
    public void setIsAdministrator(boolean isAdministrator) {
        this.isAdministrator = isAdministrator;
    }

    /**
     * @return the isRemoved
     */
    public boolean isIsRemoved() {
        return isRemoved;
    }

    /**
     * @param isRemoved the isRemoved to set
     */
    public void setIsRemoved(boolean isRemoved) {
        this.isRemoved = isRemoved;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the lastSignedIn
     */
    public Calendar getLastSignedIn() {
        return lastSignedIn;
    }

    /**
     * @param lastSignedIn the lastSignedIn to set
     */
    public void setLastSignedIn(Calendar lastSignedIn) {
        this.lastSignedIn = lastSignedIn;
    }

    /**
     * @return the lastSignedInFormatted
     */
    public String getLastSignedInFormatted() {
        return lastSignedInFormatted;
    }

    /**
     * @param lastSignedInFormatted the lastSignedInFormatted to set
     */
    public void setLastSignedInFormatted(String lastSignedInFormatted) {
        this.lastSignedInFormatted = lastSignedInFormatted;
    }

    /**
     * @return the notificationFrequency
     */
    public String getNotificationFrequency() {
        return notificationFrequency;
    }

    /**
     * @param notificationFrequency the notificationFrequency to set
     */
    public void setNotificationFrequency(String notificationFrequency) {
        this.notificationFrequency = notificationFrequency;
    }

    /**
     * @return the notificationIgnoreSelf
     */
    public boolean isNotificationIgnoreSelf() {
        return notificationIgnoreSelf;
    }

    /**
     * @param notificationIgnoreSelf the notificationIgnoreSelf to set
     */
    public void setNotificationIgnoreSelf(boolean notificationIgnoreSelf) {
        this.notificationIgnoreSelf = notificationIgnoreSelf;
    }

    /**
     * @return the notificationScopeMessages
     */
    public String getNotificationScopeMessages() {
        return notificationScopeMessages;
    }

    /**
     * @param notificationScopeMessages the notificationScopeMessages to set
     */
    public void setNotificationScopeMessages(String notificationScopeMessages) {
        this.notificationScopeMessages = notificationScopeMessages;
    }

    /**
     * @return the notificationScopeMilestones
     */
    public String getNotificationScopeMilestones() {
        return notificationScopeMilestones;
    }

    /**
     * @param notificationScopeMilestones the notificationScopeMilestones to set
     */
    public void setNotificationScopeMilestones(String notificationScopeMilestones) {
        this.notificationScopeMilestones = notificationScopeMilestones;
    }

    /**
     * @return the notificationScopeSource
     */
    public String getNotificationScopeSource() {
        return notificationScopeSource;
    }

    /**
     * @param notificationScopeSource the notificationScopeSource to set
     */
    public void setNotificationScopeSource(String notificationScopeSource) {
        this.notificationScopeSource = notificationScopeSource;
    }

    /**
     * @return the notificationScopeTickets
     */
    public String getNotificationScopeTickets() {
        return notificationScopeTickets;
    }

    /**
     * @param notificationScopeTickets the notificationScopeTickets to set
     */
    public void setNotificationScopeTickets(String notificationScopeTickets) {
        this.notificationScopeTickets = notificationScopeTickets;
    }

    /**
     * @return the showHelpMessages
     */
    public boolean isShowHelpMessages() {
        return showHelpMessages;
    }

    /**
     * @param showHelpMessages the showHelpMessages to set
     */
    public void setShowHelpMessages(boolean showHelpMessages) {
        this.showHelpMessages = showHelpMessages;
    }

    /**
     * @return the textMarkup
     */
    public String getTextMarkup() {
        return textMarkup;
    }

    /**
     * @param textMarkup the textMarkup to set
     */
    public void setTextMarkup(String textMarkup) {
        this.textMarkup = textMarkup;
    }

    /**
     * @return the timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * @param timeZone the timeZone to set
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
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

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

}
