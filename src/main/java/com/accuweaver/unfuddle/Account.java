/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accuweaver.unfuddle;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author robweaver
 */
public class Account {
    
    private String accessKey;
    private Calendar createdAt;
    private Integer defaulTicketReportId;
    private String defaultTimeZone;
    private String description;
    private Integer diskUsage;
    private Integer id;
    private String plan; // [private, micro, compact, corporate, enterprise]
    private String subdomain;
    /**
     * a list with valid markups; the first value is the default one
     */
    private List<String> textMarkup;
    private String title;
    private Calendar updatedAt;
    /**
     * the following is read-only and describes the feature set of an account
     */
    private Features features;

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
     * @return the defaulTicketReportId
     */
    public Integer getDefaulTicketReportId() {
        return defaulTicketReportId;
    }

    /**
     * @param defaulTicketReportId the defaulTicketReportId to set
     */
    public void setDefaulTicketReportId(Integer defaulTicketReportId) {
        this.defaulTicketReportId = defaulTicketReportId;
    }

    /**
     * @return the defaultTimeZone
     */
    public String getDefaultTimeZone() {
        return defaultTimeZone;
    }

    /**
     * @param defaultTimeZone the defaultTimeZone to set
     */
    public void setDefaultTimeZone(String defaultTimeZone) {
        this.defaultTimeZone = defaultTimeZone;
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
     * @return the plan
     */
    public String getPlan() {
        return plan;
    }

    /**
     * @param plan the plan to set
     */
    public void setPlan(String plan) {
        this.plan = plan;
    }

    /**
     * @return the subdomain
     */
    public String getSubdomain() {
        return subdomain;
    }

    /**
     * @param subdomain the subdomain to set
     */
    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    /**
     * @return the textMarkup
     */
    public List<String> getTextMarkup() {
        return textMarkup;
    }

    /**
     * @param textMarkup the textMarkup to set
     */
    public void setTextMarkup(List<String> textMarkup) {
        this.textMarkup = textMarkup;
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

    /**
     * @return the features
     */
    public Features getFeatures() {
        return features;
    }

    /**
     * @param features the features to set
     */
    public void setFeatures(Features features) {
        this.features = features;
    }

   
}
