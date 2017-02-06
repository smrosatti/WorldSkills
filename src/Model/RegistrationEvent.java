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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



/**
 *
 * @author samuel
 */
@Entity @Table
public class RegistrationEvent extends Model{
    @Id  @GeneratedValue (strategy=GenerationType.IDENTITY)
   private int RegistrationEventId;
    @OneToOne 
   private Registration RegistrationId;
    @ManyToOne    
   private Event Eventid;
    @Column
   private int BibNumber;
    @Column
   private int RaceTime;

    public RegistrationEvent() {
    }

    public RegistrationEvent(int RegistrationEventId, Registration RegistrationId, Event Eventid, int BibNumber, int RaceTime) {
        this.RegistrationEventId = RegistrationEventId;
        this.RegistrationId = RegistrationId;
        this.Eventid = Eventid;
        this.BibNumber = BibNumber;
        this.RaceTime = RaceTime;
    }

    public RegistrationEvent(Registration RegistrationId, Event Eventid, int BibNumber, int RaceTime) {
        this.RegistrationId = RegistrationId;
        this.Eventid = Eventid;
        this.BibNumber = BibNumber;
        this.RaceTime = RaceTime;
    }

    public int getRegistrationEventId() {
        return RegistrationEventId;
    }

    public void setRegistrationEventId(int RegistrationEventId) {
        this.RegistrationEventId = RegistrationEventId;
    }

    public Registration getRegistrationId() {
        return RegistrationId;
    }

    public void setRegistrationId(Registration RegistrationId) {
        this.RegistrationId = RegistrationId;
    }

    public Event getEventid() {
        return Eventid;
    }

    public void setEventid(Event Eventid) {
        this.Eventid = Eventid;
    }

    public int getBibNumber() {
        return BibNumber;
    }

    public void setBibNumber(int BibNumber) {
        this.BibNumber = BibNumber;
    }

    public int getRaceTime() {
        return RaceTime;
    }

    public void setRaceTime(int RaceTime) {
        this.RaceTime = RaceTime;
    }
   
   

   
}
