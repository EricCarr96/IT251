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
public abstract class Accounts {
    
     int accountID;
     String firstName;
     String lastName;
     int numberofSales;
    
    
    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberofSales() {
        return numberofSales;
    }

    public void setNumberofSales(int numberofSales) {
        this.numberofSales = numberofSales;
    }
    
    

    @Override
    public String toString() {
        return " Accounts {" + "accountID = " + accountID + ", firstName = " + firstName + ", lastName = " + lastName + '}';
    }
    public abstract double computeSales();
    
}






