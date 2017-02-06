/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 *
 * @author samuel
 */
@Entity @Table
public class EventType extends Model{
    @Id @GeneratedValue (strategy=GenerationType.IDENTITY)
   private int EventTypeId;
   @Column
   private String EventTypeName;

    public EventType() {
    }

    public EventType(int EventTypeId, String EventTypeName) {
        this.EventTypeId = EventTypeId;
        this.EventTypeName = EventTypeName;
    }
   
   

    public int getEventTypeId() {
        return EventTypeId;
    }

    public void setEventTypeId(int EventTypeId) {
        this.EventTypeId = EventTypeId;
    }

    public String getEventTypeName() {
        return EventTypeName;
    }

    public void setEventTypeName(String EventTypeName) {
        this.EventTypeName = EventTypeName;
    }

   
}
