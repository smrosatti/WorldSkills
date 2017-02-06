/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author samuel
 */

@Entity @Table
public class Event extends Model{
    @Id @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int EventId;
    @Column
    private String EventName;
    @ManyToOne @JoinColumn(name = "eventtypeid")
    private EventType EventTypeId;
    @ManyToOne @JoinColumn (name = "marathonid")
    private Marathon MarathonId;
    @Column
    private LocalDate StartDateTime;
    @Column
    private double Cost;
    @Column
    private int MaxParticipants;

    public Event() {
    }

    public Event(int EventId, String EventName, EventType EventTypeId, Marathon MarathonId, LocalDate StartDateTime, double Cost, int MaxParticipants) {
        this.EventId = EventId;
        this.EventName = EventName;
        this.EventTypeId = EventTypeId;
        this.MarathonId = MarathonId;
        this.StartDateTime = StartDateTime;
        this.Cost = Cost;
        this.MaxParticipants = MaxParticipants;
    }
    
    

    public int getEventId() {
        return EventId;
    }

    public void setEventId(int EventId) {
        this.EventId = EventId;
    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    public EventType getEventTypeId() {
        return EventTypeId;
    }

    public void setEventTypeId(EventType EventTypeId) {
        this.EventTypeId = EventTypeId;
    }

    public Marathon getMarathonId() {
        return MarathonId;
    }

    public void setMarathonId(Marathon MarathonId) {
        this.MarathonId = MarathonId;
    }

    public LocalDate getStartDateTime() {
        return StartDateTime;
    }

    public void setStartDateTime(LocalDate StartDateTime) {
        this.StartDateTime = StartDateTime;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double Cost) {
        this.Cost = Cost;
    }

    public int getMaxParticipants() {
        return MaxParticipants;
    }

    public void setMaxParticipants(int MaxParticipants) {
        this.MaxParticipants = MaxParticipants;
    }

  


}
