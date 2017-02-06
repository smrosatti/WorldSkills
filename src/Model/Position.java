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
public class Position extends Model{
    @Id  @GeneratedValue (strategy=GenerationType.IDENTITY)
    private int PositionId;
    @Column
    private String PositionName;
   @Column
    private String PositionDescription;
   @Column
    private double Payrate;

    public Position(int PositionId, String PositionName, String PositionDescription, double Payrate) {
        this.PositionId = PositionId;
        this.PositionName = PositionName;
        this.PositionDescription = PositionDescription;
        this.Payrate = Payrate;
    }

    public Position() {
    }

    public int getPositionId() {
        return PositionId;
    }

    public void setPositionId(int PositionId) {
        this.PositionId = PositionId;
    }

    public String getPositionName() {
        return PositionName;
    }

    public void setPositionName(String PositionName) {
        this.PositionName = PositionName;
    }

    public String getPositionDescription() {
        return PositionDescription;
    }

    public void setPositionDescription(String PositionDescription) {
        this.PositionDescription = PositionDescription;
    }

    public double getPayrate() {
        return Payrate;
    }

    public void setPayrate(double Payrate) {
        this.Payrate = Payrate;
    }

    
}
