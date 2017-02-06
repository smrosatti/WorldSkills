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
import javax.persistence.Table;


/**
 *
 * @author samuel
 */
@Entity @Table
public class Marathon extends Model{
    @Id  @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int MarathonId;
    @Column
    private String MarathonName;
   @Column
    private String CityName;
   @ManyToOne @JoinColumn(name = "countrycode")
    private Country CountryCode;
    @Column
    private int YearHeld;

    public Marathon() {
    }

    public Marathon(int MarathonId, String MarathonName, String CityName, Country CountryCode, int YearHeld) {
        this.MarathonId = MarathonId;
        this.MarathonName = MarathonName;
        this.CityName = CityName;
        this.CountryCode = CountryCode;
        this.YearHeld = YearHeld;
    }

    public int getMarathonId() {
        return MarathonId;
    }

    public void setMarathonId(int MarathonId) {
        this.MarathonId = MarathonId;
    }

    public String getMarathonName() {
        return MarathonName;
    }

    public void setMarathonName(String MarathonName) {
        this.MarathonName = MarathonName;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public Country getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(Country CountryCode) {
        this.CountryCode = CountryCode;
    }

    public int getYearHeld() {
        return YearHeld;
    }

    public void setYearHeld(int YearHeld) {
        this.YearHeld = YearHeld;
    }

   
}
