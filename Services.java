/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Administrator
 */
public class Services extends Accounts {
    
     double numberOfHours= 8.4;
     double ratePerHours= 8.2;

    Services(int accountID) {
        
    }

    Services() {
        
    }
   
    public double getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(double numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public double getRatePerHours() {
        return ratePerHours;
    }

    public void setRatePerHours(double ratePerHours) {
        this.ratePerHours = ratePerHours;
    }

    @Override
    public String toString() {
        return "Services{" + "numberOfHours = " + numberOfHours 
                + ", ratePerHours = " + ratePerHours + " Account ID = " +
                getAccountID() + " Computed Sales = " + computeSales()  + super.toString() + '}';
    }

    @Override
    public double computeSales() {
        return  numberOfHours * ratePerHours;
    }

   
 
    
 
        
    }

    

    

    
    

