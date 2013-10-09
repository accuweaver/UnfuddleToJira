/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accuweaver.unfuddle;

import java.util.Calendar;

/**
 *
 * @author robweaver
 */
public class Ticket extends Record {
    private Integer assigneeId;
  private Integer componentId;
  private Calendar createdAt;
  private String description;
  private String descriptionFormat; // [markdown, textile, plain]
  private String descriptionFormatted; // -- only available if formatted=true 
  private Calendar dueOn;
  private String dueOnFormatted;
  private Integer field1ValueId;
  private Integer field2ValueId;
  private Integer field3ValueId;
  private Float hoursEstimateCurrent;
  private Float hoursEstimateInitial;
  private Integer id;
  private Integer milestoneId;
  private Integer number;
  private Integer priority; // [1, 2, 3, 4, 5]
  private Integer projectId;
  private Integer reporterId;
  private String resolution; // [fixed, works_for_me, postponed, duplicate, will_not_fix, invalid]
  private Integer resolutionDescription;
  private String resolutionDescriptionFormat;
  private Integer resolutionDescriptionFormatted; // -- only available if formatted=true 
  private Integer severityId;
  private String status; // [new, unaccepted, reassigned, reopened, accepted, resolved, closed]
  private String summary;
  private Calendar updatedAt;
  private Integer versionId;
    
  /** !--
  The following are not actual ticket attributes, but when creating or updating
  a ticket, including any of these three attributes instead of the corresponding
  private Integer fieldNValueId> attributes will allow you to create a new value for
  the ticekt field if that field is of the "text" disposition.
  **/
  private String field1Value;
  private String field2Value;
  private String field3Value;
  
  private Comments comments; // only available for GET requests if comments=true -->
    
  
  private Attachments attachments;

}
