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
public class Paper extends Accounts{
    
      double numberOfPounds=2.0;
      double pricePerPound=10.0;

 public   Paper(int accountID) {
       
    }

   public Paper() {
        
    }

    

  
    
    public double getNumberOfPounds() {
        return numberOfPounds;
    }

    public void setNumberOfPounds(double numberOfPounds) {
        this.numberOfPounds = numberOfPounds;
    }

    public double getPricePerPound() {
        return pricePerPound;
    }

    public void setPricePerPound (double pricePerPound) {
        this.pricePerPound = pricePerPound;
    }
    

    @Override
    public String toString() {
        return "Paper{" + "numberOfPounds = " + numberOfPounds 
                + ", pricePerPound = " + pricePerPound + 
                getAccountID() + " computed sales = " + computeSales() + super.toString() +  '}';
    }

    @Override
    public double computeSales() {
        
        return numberOfPounds * pricePerPound;
    }

    void computeSales(double computeSales) {
       
    }

   
    
    
   
    
}
