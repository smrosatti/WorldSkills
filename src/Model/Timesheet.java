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
public class Timesheet extends Model{
    @Id  @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int TimesheetId;
    @ManyToOne   @JoinColumn(name = "staffid")
    private Staff StaffId;
    @Column
    private LocalDate StartDateTime;
    @Column
    private LocalDate EndDateTime;
    @Column
    private double PayAmount;

    public Timesheet() {
    }

    public Timesheet(int TimesheetId, Staff StaffId, LocalDate StartDateTime, LocalDate EndDateTime, double PayAmount) {
        this.TimesheetId = TimesheetId;
        this.StaffId = StaffId;
        this.StartDateTime = StartDateTime;
        this.EndDateTime = EndDateTime;
        this.PayAmount = PayAmount;
    }

    public Timesheet(Staff StaffId, LocalDate StartDateTime, LocalDate EndDateTime, double PayAmount) {
        this.StaffId = StaffId;
        this.StartDateTime = StartDateTime;
        this.EndDateTime = EndDateTime;
        this.PayAmount = PayAmount;
    }

    public int getTimesheetId() {
        return TimesheetId;
    }

    public void setTimesheetId(int TimesheetId) {
        this.TimesheetId = TimesheetId;
    }

    public Staff getStaffId() {
        return StaffId;
    }

    public void setStaffId(Staff StaffId) {
        this.StaffId = StaffId;
    }

    public LocalDate getStartDateTime() {
        return StartDateTime;
    }

    public void setStartDateTime(LocalDate StartDateTime) {
        this.StartDateTime = StartDateTime;
    }

    public LocalDate getEndDateTime() {
        return EndDateTime;
    }

    public void setEndDateTime(LocalDate EndDateTime) {
        this.EndDateTime = EndDateTime;
    }

    public double getPayAmount() {
        return PayAmount;
    }

    public void setPayAmount(double PayAmount) {
        this.PayAmount = PayAmount;
    }

    
}
