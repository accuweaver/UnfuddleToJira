/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accuweaver.unfuddle;

import java.util.Calendar;

/**
 * <event>
 * <project-id type="integer"> </project-id>
 * <created-at type="datetime"> </created-at>
 * <record-type> [Message, Milestone, Ticket, TimeEntry, Changeset, Comment]
 * </record-type>
 * <record-id type="integer"> </record-id>
 * <event> [accept, close, commit, create, delete, reopen, resolve, unaccept,
 * status_update] </event>
 * <description> </description>
 * <person-id type="integer"> </person-id>
 * <summary> </summary>
 *
    <!-- if a record exists, then it will be included here. note that only ONE of
 * these will exist, corresponding to record-type see data model documentation
 * for format. -->
 * <record>
 * <message> ... </message>
 * <milestone> ... </milestone>
 * <ticket> ... </ticket>
 * <time-entry> ... </time-entry>
 * <changeset> ... </changeset>
 * <comment> ... </comment>
 * </event>
 *
 * @author robweaver
 */
class Event {
    private Integer projectId;
    private Calendar createdAt;
    private String recordType; // [Message, Milestone, Ticket, TimeEntry, Changeset, Comment]
    private Integer recordId;
    private String event; // [accept, close, commit, create, delete, reopen, resolve, unaccept, status_update]
    private String description;
    private Integer personId;
    private String summary;
    
    /**--
      if a record exists, then it will be included here.
      note that only ONE of these will exist, corresponding to record-type
      see data model documentation for format.
    */
    private Record record;
    
}
