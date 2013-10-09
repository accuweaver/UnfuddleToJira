/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accuweaver.unfuddle;

/**
 *
 * @author robweaver
 */
class Features {
    private boolean attachments;
    private boolean sslType;
    /** Storage in Megabytes */
    private Integer storage;
    private boolean timeTracking;

    /**
     * @return the attachments
     */
    public boolean isAttachments() {
        return attachments;
    }

    /**
     * @param attachments the attachments to set
     */
    public void setAttachments(boolean attachments) {
        this.attachments = attachments;
    }

    /**
     * @return the sslType
     */
    public boolean isSslType() {
        return sslType;
    }

    /**
     * @param sslType the sslType to set
     */
    public void setSslType(boolean sslType) {
        this.sslType = sslType;
    }

    /**
     * @return the storage
     */
    public Integer getStorage() {
        return storage;
    }

    /**
     * @param storage the storage to set
     */
    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    /**
     * @return the timeTracking
     */
    public boolean isTimeTracking() {
        return timeTracking;
    }

    /**
     * @param timeTracking the timeTracking to set
     */
    public void setTimeTracking(boolean timeTracking) {
        this.timeTracking = timeTracking;
    }
    
}
