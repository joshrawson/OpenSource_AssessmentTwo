/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simon Lehmann
 */
public class PerDayRental {
        
    private double perDayKm;
    private final int CHARGE_RATE_DAY = 100;
    private double totalCost;
    private int daysRented;
    
    private Journey getDistance;
    
    PerDayRental(int daysRented){
        perDayKm = getDistance.getKilometers();
        daysRented = this.daysRented;
    }
    
    double computeDays() {
        totalCost = CHARGE_RATE_DAY * daysRented;
        return totalCost;
    }
}
