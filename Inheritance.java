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
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
              Accounts a = null;
        while (true)
        {
            System.out.println("What type of Account are you?");
            System.out.println("Enter 1 for Paper, 2 for Services, 3 for Supplies");
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            System.out.println(input);

            CommandLineHelper helper = new CommandLineHelper();


            switch(input)
            {
                case "1":
                  a = helper.getPaperInfoFromUser(in);
                break;
                case "2":
                  a = helper.getServicesInfoFromUser(in);
                break;
                case "3":
                   a = helper.getSuppliesFromUser(in);
                break;
                default:
                    System.out.println("Please try again entry not valid");


            }
            if (a != null)
            {
              break;
            }
        }
        System.out.println(a);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    private void save()
    {
         
     
      Supplies s = new Supplies();
      s.setAccountID(6);
      s.setSupplyID(14);
      s.setTotalSold(45);
      s.setFirstName(" Gaige  ");
      s.setLastName(" Cox  ");
      
      
      
      Services ser = new Services();
      ser.setAccountID(1);
      ser.setNumberOfHours(44);
      ser.setRatePerHours(4);
      ser.setFirstName(" Miohn  ");
      ser.setLastName(" Allen  ");
      
      
      
      
      Paper p = new Paper();
      p.setAccountID(2);
      p.setNumberOfPounds(60);
      p.setPricePerPound(4);
      p.setFirstName(" Deion  ");
      p.setLastName(" Johnson  ");
      
      
      Accounts [] account = new Accounts[3];
      account[0] = s;
      account[1] = ser;
      account[2] = p;
      
      
      
      System.out.println(".................................");
      
      for 
              (Accounts a: account){
      
      System.out.println(a.computeSales());
      }
      
      
       System.out.println(".................................");
     
      System.out.println(s);
      System.out.println("Total Supplies equals: " + s.computeSales());
      System.out.println(ser);
      System.out.println("Total  Service: " + ser.computeSales());
      System.out.println(p);
      System.out.println("Total  Paper: " + p.computeSales());
    }
    
}
