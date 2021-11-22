package com.bsuir.LAB2.Entity;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class VacuumCleaner implements  IProduct , Serializable {

    private String ProductName;
    private int PowerConsumption;
    private String FilterType;
    private String BagType;
    private String WandType;
    private int MotorSpeedRegulation;
    private int CleaningWidth;

    public VacuumCleaner(String ProductName,int PowerConsumption,String FilterType,
            String BagType,String WandType,int MotorSpeedRegulation,int CleaningWidth)
    {
        this.PowerConsumption=PowerConsumption;
        this.FilterType=FilterType;
        this.BagType=BagType;
        this.WandType=WandType;
        this.MotorSpeedRegulation=MotorSpeedRegulation;
        this.CleaningWidth=CleaningWidth;
        this.ProductName=ProductName;
    }

    public int GetPowerConsumption(){
        return PowerConsumption;
    }

    public String GetFilterType(){
        return FilterType;
    }
    public String GetBagType(){
        return BagType;
    }

    public String GetWandType(){return WandType;}
    public int GetMotorSpeedRegulation(){return MotorSpeedRegulation;}
    public int GetCleaningWidth(){return CleaningWidth;}


    public String GetProductName(){
        return ProductName;
    }

    /**
     *  Method returns a list of all criteria for the product implemented in the class
     *  @return Criteria list
     */
    public ArrayList<String> GetCriteria()
    {
        ArrayList<String> Criteria = new ArrayList<String>();

        Field[] field = this.getClass().getDeclaredFields();
        for(Field item:field)
        {
            Criteria.add(item.getName());
        }

        return Criteria;
    }
}
