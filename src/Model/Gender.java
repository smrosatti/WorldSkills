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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



/**
 *
 * @author samuel
 */
@Entity @Table
public class Gender extends Model{
    @Id   @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int GenderId;
    @Column 
    private String Gender;
    @OneToMany(cascade={CascadeType.PERSIST,CascadeType.REFRESH},fetch=EAGER)
    private List<Volunteer> v  = new ArrayList<>();
       @OneToMany(cascade={CascadeType.PERSIST,CascadeType.REFRESH},fetch=EAGER)
    private List<Runner> runner = new ArrayList<>();

    @Override
    public String toString() {
        return   Gender;
    }
       

    public Gender(int GenderId, String Gender) {
        this.GenderId = GenderId;
        this.Gender = Gender;
    }

    public Gender(String Gender) {
        this.Gender = Gender;
    }

    public Gender() {
    }

    public int getGenderId() {
        return GenderId;
    }

    public void setGenderId(int GenderId) {
        this.GenderId = GenderId;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }



  
}
