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
public class Charity extends Model {
@Id
@GeneratedValue (strategy=GenerationType.IDENTITY)
    private int   CharityId;
 @Column
    private String CharityName;
  @Column
    private String CharityDescription;
  @Column  
    private String CharityLogo;

    public Charity(String CharityName, String CharityDescription, String CharityLogo) {
        this.CharityName = CharityName;
        this.CharityDescription = CharityDescription;
        this.CharityLogo = CharityLogo;
    }

    public Charity(int CharityId, String CharityName, String CharityDescription, String CharityLogo) {
        this.CharityId = CharityId;
        this.CharityName = CharityName;
        this.CharityDescription = CharityDescription;
        this.CharityLogo = CharityLogo;
    }
    
    

    public Charity() {
    }

    public int getCharityId() {
        return CharityId;
    }

    public void setCharityId(int CharityId) {
        this.CharityId = CharityId;
    }

    public String getCharityName() {
        return CharityName;
    }

    public void setCharityName(String CharityName) {
        this.CharityName = CharityName;
    }

    public String getCharityDescription() {
        return CharityDescription;
    }

    public void setCharityDescription(String CharityDescription) {
        this.CharityDescription = CharityDescription;
    }

    public String getCharityLogo() {
        return CharityLogo;
    }

    public void setCharityLogo(String CharityLogo) {
        this.CharityLogo = CharityLogo;
    }
}
