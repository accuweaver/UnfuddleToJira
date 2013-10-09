/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accuweaver.unfuddle;

import java.util.Calendar;

/**
 * content-type> </content-type>
 * <created-at type="datetime"> </created-at>
 * <filename> </filename>
 * <id type="integer"> </id>
 * <parent-id type="integer"> </parent-id>
 * <parent-type> [Message, Ticket, Notebook, Comment] </parent-type>
 * <size> </size>
 * <updated-at type="datetime"> </updated-at>
 *
  <!-- when creating a new attachment, the following section must also be
 * including in order to reference the upload key you received after uploading
 * the file to the API -->
 * <upload>
 * <key> </key>
 * </upload>
 *
 * @author robweaver
 */
class Attachment {
    private String contentType;
    private Calendar createdAt;
    private String fileName;
    private Integer id;
    private Integer parentId;
    private String parentType; // [Message, Ticket, Notebook, Comment] 
    private Integer size;
    private Calendar updatedAt;

    private String uploadKey;
    /**
     * @return the contentType
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * @param contentType the contentType to set
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
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
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
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
     * @return the parentId
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * @param parentId the parentId to set
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * @return the parentType
     */
    public String getParentType() {
        return parentType;
    }

    /**
     * @param parentType the parentType to set
     */
    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    /**
     * @return the size
     */
    public Integer getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(Integer size) {
        this.size = size;
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
     * @return the uploadKey
     */
    public String getUploadKey() {
        return uploadKey;
    }

    /**
     * @param uploadKey the uploadKey to set
     */
    public void setUploadKey(String uploadKey) {
        this.uploadKey = uploadKey;
    }
    
}
