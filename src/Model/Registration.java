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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author samuel
 */
@Entity @Table
public class Registration extends Model{
@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int RegistrationId;
@ManyToOne @JoinColumn(name = "runnerid")
    private Runner RunnerId;
    private LocalDate RegistrationDateTime;
@ManyToOne @JoinColumn(name = "racekitoptionid")
    private RaceKitOption RaceKitOptionId;
@ManyToOne @JoinColumn(name = "registrationstatusid")
    private RegistrationStatus RegistrationStatusId;   
@Column
    private double Cost;
@ManyToOne @JoinColumn(name = "charityid")
    private Charity CharityId;
@Column
    private double SponsorshipTarget; 

    public Registration() {
    }

    public Registration(int RegistrationId, Runner RunnerId, LocalDate RegistrationDateTime, RaceKitOption RaceKitOptionId, RegistrationStatus RegistrationStatusId, double Cost, Charity CharityId, double SponsorshipTarget) {
        this.RegistrationId = RegistrationId;
        this.RunnerId = RunnerId;
        this.RegistrationDateTime = RegistrationDateTime;
        this.RaceKitOptionId = RaceKitOptionId;
        this.RegistrationStatusId = RegistrationStatusId;
        this.Cost = Cost;
        this.CharityId = CharityId;
        this.SponsorshipTarget = SponsorshipTarget;
    }

    public int getRegistrationId() {
        return RegistrationId;
    }

    public void setRegistrationId(int RegistrationId) {
        this.RegistrationId = RegistrationId;
    }

    public Runner getRunnerId() {
        return RunnerId;
    }

    public void setRunnerId(Runner RunnerId) {
        this.RunnerId = RunnerId;
    }

    public LocalDate getRegistrationDateTime() {
        return RegistrationDateTime;
    }

    public void setRegistrationDateTime(LocalDate RegistrationDateTime) {
        this.RegistrationDateTime = RegistrationDateTime;
    }

    public RaceKitOption getRaceKitOptionId() {
        return RaceKitOptionId;
    }

    public void setRaceKitOptionId(RaceKitOption RaceKitOptionId) {
        this.RaceKitOptionId = RaceKitOptionId;
    }

    public RegistrationStatus getRegistrationStatusId() {
        return RegistrationStatusId;
    }

    public void setRegistrationStatusId(RegistrationStatus RegistrationStatusId) {
        this.RegistrationStatusId = RegistrationStatusId;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double Cost) {
        this.Cost = Cost;
    }

    public Charity getCharityId() {
        return CharityId;
    }

    public void setCharityId(Charity CharityId) {
        this.CharityId = CharityId;
    }

    public double getSponsorshipTarget() {
        return SponsorshipTarget;
    }

    public void setSponsorshipTarget(double SponsorshipTarget) {
        this.SponsorshipTarget = SponsorshipTarget;
    }

   
}
