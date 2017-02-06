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
public class Role extends Model{
    @Id   @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int Roleid;
    @Column
    private String RoleName;

    public Role(int Roleid, String RoleName) {
        this.Roleid = Roleid;
        this.RoleName = RoleName;
    }

    public int getRoleid() {
        return Roleid;
    }

    public void setRoleid(int Roleid) {
        this.Roleid = Roleid;
    }
   
    

    public Role(String RoleName) {
        this.RoleName = RoleName;
    }

    public Role() {
    }
    

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }
}
