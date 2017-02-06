/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import static javax.persistence.FetchType.EAGER;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



/**
 *
 * @author samuel
 */
@Entity
@Table
public class Country extends Model{
    @Id
    private String CountryCode;
   @Column
    private String CountryName;
    @Column
    private String CountryFlag;
     @OneToMany(cascade={CascadeType.PERSIST,CascadeType.REFRESH},fetch=EAGER)
    private List<Volunteer> voluntarios = new ArrayList<>();
      @OneToMany(cascade={CascadeType.PERSIST,CascadeType.REFRESH},fetch=EAGER)
    private List<Marathon> maratona = new ArrayList<>();
       @OneToMany(cascade={CascadeType.PERSIST,CascadeType.REFRESH},fetch=EAGER)
    private List<Runner> runner = new ArrayList<>();

    @Override
    public String toString() {
        return "(" + CountryCode + ") " + CountryName;
    }
       
       

    public List<Volunteer> getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(List<Volunteer> voluntarios) {
        this.voluntarios = voluntarios;
    }

    public List<Marathon> getMaratona() {
        return maratona;
    }

    public void setMaratona(List<Marathon> maratona) {
        this.maratona = maratona;
    }

    public List<Runner> getRunner() {
        return runner;
    }

    public void setRunner(List<Runner> runner) {
        this.runner = runner;
    }

    public Country() {
    }

    public Country(String CountryCode, String CountryName, String CountryFlag) {
        this.CountryCode = CountryCode;
        this.CountryName = CountryName;
        this.CountryFlag = CountryFlag;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    public String getCountryFlag() {
        return CountryFlag;
    }

    public void setCountryFlag(String CountryFlag) {
        this.CountryFlag = CountryFlag;
    }
    
 
}
