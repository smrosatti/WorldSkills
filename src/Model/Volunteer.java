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
public class Volunteer extends Model{
   @Id  @GeneratedValue (strategy=GenerationType.IDENTITY)
   private int VolunteerId;
   @Column
   private String FirstName;
   @Column
   private String LastName;
   @OneToOne  @JoinColumn(name = "countrycode")
   private Country CountryCode;
   @OneToOne @JoinColumn(name = "gender")
   private Gender Gender;

    public Volunteer() {
    }

    public Volunteer(int VolunteerId, String FirstName, String LastName, Country CountryCode, Gender Gender) {
        this.VolunteerId = VolunteerId;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.CountryCode = CountryCode;
        this.Gender = Gender;
    }

    public Volunteer(String FirstName, String LastName, Country CountryCode, Gender Gender) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.CountryCode = CountryCode;
        this.Gender = Gender;
    }

    public int getVolunteerId() {
        return VolunteerId;
    }

    public void setVolunteerId(int VolunteerId) {
        this.VolunteerId = VolunteerId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public Country getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(Country CountryCode) {
        this.CountryCode = CountryCode;
    }

    public Gender getGender() {
        return Gender;
    }

    public void setGender(Gender Gender) {
        this.Gender = Gender;
    }

  
   
}
