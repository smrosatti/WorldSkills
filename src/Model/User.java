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
@Entity @Table (name = "user_")
public class User extends Model{
    @Id  @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int UserId;
    @Column
    private String Email;
    @Column
    private String Password;
    @Column
    private String FirstName;
    @Column
    private String LastName;
    @ManyToOne  @JoinColumn (name = "roleid")
    private Role RoleId;

    public User() {
    }

    public User(int UserId, String Email, String Password, String FirstName, String LastName, Role RoleId) {
        this.UserId = UserId;
        this.Email = Email;
        this.Password = Password;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.RoleId = RoleId;
    }

    public User(String Email, String Password, String FirstName, String LastName, Role RoleId) {
        this.Email = Email;
        this.Password = Password;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.RoleId = RoleId;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
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

    public Role getRoleId() {
        return RoleId;
    }

    public void setRoleId(Role RoleId) {
        this.RoleId = RoleId;
    }

   
}
