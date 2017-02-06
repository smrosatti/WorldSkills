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
public class RaceKitOption extends Model{
@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
   private int RaceKitOptionId;
@Column
   private String RaceKitOption;
@Column
   private double RaceKitCost;

    public RaceKitOption() {
    }

    public RaceKitOption(int RaceKitOptionId, String RaceKitOption, double RaceKitCost) {
        this.RaceKitOptionId = RaceKitOptionId;
        this.RaceKitOption = RaceKitOption;
        this.RaceKitCost = RaceKitCost;
    }

    public int getRaceKitOptionId() {
        return RaceKitOptionId;
    }

    public void setRaceKitOptionId(int RaceKitOptionId) {
        this.RaceKitOptionId = RaceKitOptionId;
    }

    public String getRaceKitOption() {
        return RaceKitOption;
    }

    public void setRaceKitOption(String RaceKitOption) {
        this.RaceKitOption = RaceKitOption;
    }

    public double getRaceKitCost() {
        return RaceKitCost;
    }

    public void setRaceKitCost(double RaceKitCost) {
        this.RaceKitCost = RaceKitCost;
    }

   
}
