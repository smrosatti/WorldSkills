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
public class RegistrationStatus extends Model{
    @Id    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int RegistrationStatusId;
    @Column
    private String RegistrationStatus;


    public RegistrationStatus(String RegistrationStatus) {
        this.RegistrationStatus = RegistrationStatus;
    }

    public RegistrationStatus() {
    }

    public RegistrationStatus(int RegistrationStatusId, String RegistrationStatus) {
        this.RegistrationStatusId = RegistrationStatusId;
        this.RegistrationStatus = RegistrationStatus;
    }

    public int getRegistrationStatusId() {
        return RegistrationStatusId;
    }

    public void setRegistrationStatusId(int RegistrationStatusId) {
        this.RegistrationStatusId = RegistrationStatusId;
    }

    

    public String getRegistrationStatus() {
        return RegistrationStatus;
    }

    public void setRegistrationStatus(String RegistrationStatus) {
        this.RegistrationStatus = RegistrationStatus;
    }
}
