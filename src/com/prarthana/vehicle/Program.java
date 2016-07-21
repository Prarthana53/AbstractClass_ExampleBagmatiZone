/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prarthana.vehicle;


import com.prarthana.vehicle.obj.BagmatiZone;
import com.prarthana.vehicle.obj.Districts;
import java.util.Scanner;

/**
 *
 * @author Pavilion G4
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        
        while(true)
        {
        System.out.println("Bagmati Zone is one of the fourteen zones of Nepal, named after the Bagmati River."+"\n"+"It is in the Central Development Region of Nepal. The zone contains the Kathmandu Valley with its conurbation of 1.5 million inhabitants." +
"\n" + "Bagmati is divided into eight districts." +"\n" +"Select to view the basic information about the districts.\n");    
        
        System.out.println("1. Bhaktapur");
        System.out.println("2. Dhading");        
        System.out.println("3. Lalitpur");
        System.out.println("4. Kathmandu");
        System.out.println("5. Kavrepalanchok");
        System.out.println("6. Nuwakot");
        System.out.println("7. Rasuwa");
        System.out.println("8. Sindhupalckok");
        System.out.println("9. Exit");
        System.out.println("Enter your choice[1-9]: ");
        int choice=sc.nextInt();
        BagmatiZone bz;
      
        
        switch(choice)
        {
            case 1:
                bz=Districts.get("Bkt");
                evaluate(bz);
                break;
            case 2:
                bz=Districts.get("Dhad");
                evaluate(bz);
                break;
            case 3:
                bz=Districts.get("Lal");
                evaluate(bz);
                break;
            case 4:
                bz=Districts.get("Ktm");
                evaluate(bz);
                break;
            case 5:
                bz=Districts.get("Kav");
                evaluate(bz);
                break;
            case 6:
                bz=Districts.get("Nuw");
                evaluate(bz);
                break;
            case 7:
                bz=Districts.get("Ras");
                evaluate(bz);
                break;
            case 8:
                bz=Districts.get("Sin");
                evaluate(bz);
                break;
            case 9:
                System.exit(0);       
        }
        
        System.out.println("Do you want to continue[Y/N]: ");
        String str=sc.next();
        if(str.equalsIgnoreCase("n")){
            System.exit(0);
        }
        }
    }
    public static void evaluate(BagmatiZone bz)
    {
        if(bz!=null)
        {
        
            System.out.println("District Name : " + bz.getDistrictName());
            System.out.println("District Type : " + bz.getDistrictType());
            System.out.println("District Headquarter : " + bz.getDistrictHeadquarter());
            System.out.println("District Area : " + bz.getDistrictArea() + " sq.km");
            System.out.println("District Total Population : " + bz.getDistrictTotalPopulation());
            
        
       
    
        }
        else{
            System.out.println("Operation can't be performed:");
        }
    }
}
