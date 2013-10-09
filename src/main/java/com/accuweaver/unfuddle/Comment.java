/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accuweaver.unfuddle;

import java.util.Calendar;

/**
 * <comment>
 * <author-id type="integer"> </author-id>
 * <body> </body>
 * <body-format> [markdown, textile, plain] </body-format>
 * <body-formatted> <!-- only available if formatted=true --> </body-formatted>
 * <created-at type="datetime"> </created-at>
 * <id type="integer"> </id>
 * <parent-id type="integer"> </parent-id>
 * <parent-type> [Message, Ticket] </parent-type>
 * <updated-at type="datetime"> </updated-at>
 *
  <attachments type="array"><!-- only available for GET requests if
 * attachments=true -->
 * <attachment>...</attachment>
 * ...
 * </attachments>
 * </comment>
 *
 * @author robweaver
 */
public class Comment extends Record {
    private Integer authorId;
    private String body;
    private String bodyFormat;
    private String bodyFormatted; // <!-- only available if formatted=true -->
    private Calendar createdAt;
    private Integer id;
    private Integer parentId;
    private String parentType; // Message, Ticket
    private Calendar updatedAt;
    private Attachments attachments;

    /**
     * @return the authorId
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * @param authorId the authorId to set
     */
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    /**
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * @return the bodyFormat
     */
    public String getBodyFormat() {
        return bodyFormat;
    }

    /**
     * @param bodyFormat the bodyFormat to set
     */
    public void setBodyFormat(String bodyFormat) {
        this.bodyFormat = bodyFormat;
    }

    /**
     * @return the bodyFormatted
     */
    public String getBodyFormatted() {
        return bodyFormatted;
    }

    /**
     * @param bodyFormatted the bodyFormatted to set
     */
    public void setBodyFormatted(String bodyFormatted) {
        this.bodyFormatted = bodyFormatted;
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
     * @return the attachments
     */
    public Attachments getAttachments() {
        return attachments;
    }

    /**
     * @param attachments the attachments to set
     */
    public void setAttachments(Attachments attachments) {
        this.attachments = attachments;
    }
}
