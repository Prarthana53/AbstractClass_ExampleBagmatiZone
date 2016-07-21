/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prarthana.vehicle.obj;

/**
 *
 * @author Pavilion G4
 */
public class Districts {

    public static BagmatiZone get(String key)
    {
    if(key.equalsIgnoreCase("Bkt"))
    {
    return new Bhaktapur();
    }else if(key.equalsIgnoreCase("Dhad"))
    {
    return new Dhading();
    }else if(key.equalsIgnoreCase("Lal"))
    {
    return new Lalitpur();
    }else if(key.equalsIgnoreCase("Ktm"))
    {
    return new Kathmandu();
    }else if(key.equalsIgnoreCase("Kav"))
    {
    return new Kavrepalanchok();
    }else if(key.equalsIgnoreCase("Nuw"))
    {
    return new Nuwakot();
    }else if(key.equalsIgnoreCase("Ras"))
    {
    return new Rasuwa();
    }else if(key.equalsIgnoreCase("Sin"))
    {
    return new Sindhupalchok();
    }
    else
        return null;
        
    }
    

    
}
