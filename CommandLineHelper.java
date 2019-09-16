/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class CommandLineHelper {
    
    public Paper  getPaperInfoFromUser(Scanner in){
       String firstName;
       String lastName;
       int accountID;
       double pricePerPound;
       double numberOfPounds;
       
       
       
         System.out.println();
    firstName = getRequiredInput(in," Welcome User, what is your first name? " );
     System.out.println();
    lastName = getRequiredInput(in," What is your last name? " );
       System.out.println();
    accountID = getInteger(in,"Enter account ID " );
       System.out.println();
       pricePerPound = getdouble(in, "What is your calculated paper price per pound? ");
       System.out.println();
       numberOfPounds = getdouble(in,"How many pounds do you have? " );
    
       
       
       Paper p = new Paper(accountID);
       p.setAccountID(accountID);
       p.setFirstName(firstName);
       p.setLastName(lastName);
       p.setPricePerPound(pricePerPound);
       p.setNumberOfPounds(numberOfPounds);
       
       
       return p;
              
    }
   
public Services getServicesInfoFromUser(Scanner in){
    
    int accountID ;
    String firstName;
    String lastName;
    double numberOfHours;
    double ratePerHours;
    
    
    
     System.out.println();
    firstName = getRequiredInput(in," Welcome User, what is your first name? " );
     System.out.println();
    lastName = getRequiredInput(in," What is your last name? " );
     System.out.println();
    accountID = getInteger(in,"Enter account ID " );
    System.out.println();
    numberOfHours = getdouble(in,"Number of service hours? " );
    System.out.println();
    ratePerHours = getdouble(in,"Rate per service hour? " );
 
    
    Services ser = new Services(accountID);
       ser.setAccountID(accountID);
       ser.setFirstName(firstName);
       ser.setLastName(lastName);
       ser.setNumberOfHours(numberOfHours);
       ser.setRatePerHours(ratePerHours);
       
       
       return ser;
}

public Supplies getSuppliesFromUser(Scanner in)       
{
    String firstName;
    String lastName;
    int accountID;
    double totalSold;
    int supplyID;
    double officeSupplies;
    double booksSold;
    double apparel;
    
    
    System.out.println();
    firstName = getRequiredInput(in," Welcome User, what is your first name? " );
     System.out.println();
    lastName = getRequiredInput(in," What is your last name? " );
    System.out.println();
    accountID = getInteger(in,"Enter account ID " );
    System.out.println();
    supplyID = getInteger(in," Enter Supply ID " );
    System.out.println();
    officeSupplies = getdouble(in,"total office supplies sold? " );
    System.out.println();
    booksSold = getdouble(in,"Total books sold?" );
    System.out.println();
    apparel = getdouble(in,"Total apparel sold?" );
    
    
    Supplies s = new Supplies(accountID);
    s.setAccountID(accountID);
    s.setFirstName(firstName);
    s.setLastName(lastName);
    s.setSupplyID(supplyID);
    s.setOfficeSupplies(officeSupplies);
    s.setBooksSold(booksSold);
    s.setApparel(apparel);
   
    
    return s;
    
    
  

}

public String getRequiredInput(Scanner in , String prompt)
{
    String input;
    while (true)
    {
        System.out.println(prompt);
        input = in.nextLine();
        
        if (input.trim().length() > 0)
        {
        
        break;
        }else
        {
        
            System.out.println(" Input is required, Please try again ");
        }
       
    
    }
    return input;

}
private int getInteger(Scanner in , String prompt)
{
    int input;
    while(true)
    {
        try
        {
        
           System.out.println(prompt);
           String number = in.nextLine();
           input = Integer.parseInt(number);
           break;      
        }catch(NumberFormatException e)
        {
            System.out.println(" Integer is required ");
        
        }
    
    
    }

    return input;
}
private double getdouble(Scanner in , String prompt)
{
    double input;
    while(true)
    {
        try
        {
        
           System.out.println(prompt);
           String value = in.nextLine();
           input = Double.parseDouble(value);
           break;      
        }catch(NumberFormatException e)
        {
            System.out.println(" Double is required ");
        
        }
    
    
    }

    return input;
}

}