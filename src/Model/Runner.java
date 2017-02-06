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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author samuel
 */
@Entity @Table
public class Runner extends Model{
    @Id  @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int RunnerId;
    @OneToOne  @JoinColumn(name = "email")
    private User Email;
    @ManyToOne @JoinColumn(name = "gender")
    private Gender Gender;
    @Column
    private LocalDate DateofBirth;
    @ManyToOne    @JoinColumn (name = "countrycode")
    private Country CountryCode;

    public Runner() {
    }

    public Runner(int RunnerId, User Email, Gender Gender, LocalDate DateofBirth, Country CountryCode) {
        this.RunnerId = RunnerId;
        this.Email = Email;
        this.Gender = Gender;
        this.DateofBirth = DateofBirth;
        this.CountryCode = CountryCode;
    }

    public Runner(User Email, Gender Gender, LocalDate DateofBirth, Country CountryCode) {
        this.Email = Email;
        this.Gender = Gender;
        this.DateofBirth = DateofBirth;
        this.CountryCode = CountryCode;
    }

    public int getRunnerId() {
        return RunnerId;
    }

    public void setRunnerId(int RunnerId) {
        this.RunnerId = RunnerId;
    }

    public User getEmail() {
        return Email;
    }

    public void setEmail(User Email) {
        this.Email = Email;
    }

    public Gender getGender() {
        return Gender;
    }

    public void setGender(Gender Gender) {
        this.Gender = Gender;
    }

    public LocalDate getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(LocalDate DateofBirth) {
        this.DateofBirth = DateofBirth;
    }

    public Country getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(Country CountryCode) {
        this.CountryCode = CountryCode;
    }

    
    
}
