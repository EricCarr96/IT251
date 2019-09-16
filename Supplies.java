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
public class Supplies extends Accounts {
    
     double totalSold;
     int supplyID;
     double officeSupplies=4.8;
     double booksSold=2.6;
     double apparel=4.0;

    Supplies(int accountID) {
        
    }

    Supplies() {
        
    }

    public double getTotalSold() {
       
        return totalSold;
    }

    public void setTotalSold(double totalSold) {
        this.totalSold = totalSold;
    }

    public int getSupplyID() {
        return supplyID;
    }

    public void setSupplyID(int supplyID) {
        this.supplyID = supplyID;
    }

    public double getOfficeSupplies() {
        return officeSupplies;
    }

    public void setOfficeSupplies(double officeSupplies) {
        this.officeSupplies = officeSupplies;
    }

    public double getBooksSold() {
        return booksSold;
    }

    public void setBooksSold(double booksSold) {
        this.booksSold = booksSold;
    }

    public double getApparel() {
        return apparel;
    }

    public void setApparel(double apparel) {
        this.apparel = apparel;
    }
    
    @Override
    public String toString() {
        return "Supplies{" + "totalSold = " + computeSales() + ", supplyID = " + 
                supplyID + " apparel sold = " + apparel + " books sold = " + booksSold
                + " office suppplies sold = " + officeSupplies  + super.toString() + '}';
        
        
    }

    @Override
    public double computeSales() {
        return officeSupplies + booksSold+ apparel;
    }

   
    
    
    
        
        
  
    }

   
    
    

