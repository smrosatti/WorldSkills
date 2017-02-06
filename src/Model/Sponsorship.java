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
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 *
 * @author samuel
 */
@Entity @Table
public class Sponsorship extends Model{
    @Id  @GeneratedValue (strategy=GenerationType.IDENTITY)
   private int SponsorshipId;
    @Column
   private String SponsorshipName;
    @OneToOne  @JoinColumn (name = "registrationid")
   private Registration RegistrationId;
    @Column
   private double Amount;

    public Sponsorship() {
    }

    public Sponsorship(int SponsorshipId, String SponsorshipName, Registration RegistrationId, double Amount) {
        this.SponsorshipId = SponsorshipId;
        this.SponsorshipName = SponsorshipName;
        this.RegistrationId = RegistrationId;
        this.Amount = Amount;
    }

    public Sponsorship(String SponsorshipName, Registration RegistrationId, double Amount) {
        this.SponsorshipName = SponsorshipName;
        this.RegistrationId = RegistrationId;
        this.Amount = Amount;
    }

    public int getSponsorshipId() {
        return SponsorshipId;
    }

    public void setSponsorshipId(int SponsorshipId) {
        this.SponsorshipId = SponsorshipId;
    }

    public String getSponsorshipName() {
        return SponsorshipName;
    }

    public void setSponsorshipName(String SponsorshipName) {
        this.SponsorshipName = SponsorshipName;
    }

    public Registration getRegistrationId() {
        return RegistrationId;
    }

    public void setRegistrationId(Registration RegistrationId) {
        this.RegistrationId = RegistrationId;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }


     
}
