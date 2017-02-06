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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author samuel
 */
@Entity @Table
public class Staff extends Model{
    @Id  @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int StaffId;
    @Column
    private String FirstName;
    @Column
    private String LastName;
    @Column
    private LocalDate DateofBirth;
    @Column
    private String Gender;
    @ManyToOne @JoinColumn(name = "positionid")
    private Position PositionId;
    @Column
    private String Comments;

    public Staff() {
    }

    public Staff(int StaffId, String FirstName, String LastName, LocalDate DateofBirth, String Gender, Position PositionId, String Comments) {
        this.StaffId = StaffId;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DateofBirth = DateofBirth;
        this.Gender = Gender;
        this.PositionId = PositionId;
        this.Comments = Comments;
    }

    public Staff(String FirstName, String LastName, LocalDate DateofBirth, String Gender, Position PositionId, String Comments) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DateofBirth = DateofBirth;
        this.Gender = Gender;
        this.PositionId = PositionId;
        this.Comments = Comments;
    }

    public int getStaffId() {
        return StaffId;
    }

    public void setStaffId(int StaffId) {
        this.StaffId = StaffId;
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

    public LocalDate getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(LocalDate DateofBirth) {
        this.DateofBirth = DateofBirth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Position getPositionId() {
        return PositionId;
    }

    public void setPositionId(Position PositionId) {
        this.PositionId = PositionId;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String Comments) {
        this.Comments = Comments;
    }

    

     
}
