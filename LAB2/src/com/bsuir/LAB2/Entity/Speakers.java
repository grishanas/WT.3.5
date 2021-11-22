package com.bsuir.LAB2.Entity;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class Speakers implements IProduct, Serializable {
    private String ProductName;
    private int PowerConsumption;
    private int NumberOfSpeakers;
    private String FrequencyRange;
    private int CordLength;

    public Speakers(String ProductName,int PowerConsumption,int NumberOfSpeakers,
            String FrequencyRange,int CordLength)
    {
        this.PowerConsumption=PowerConsumption;
        this.NumberOfSpeakers=NumberOfSpeakers;
        this.FrequencyRange=FrequencyRange;
        this.CordLength=CordLength;
        this.ProductName=ProductName;
    }

    private int GetNumberOfSpeakers(){return NumberOfSpeakers ;}
    private String GetFrequencyRange(){return FrequencyRange;}
    private int GetCordLength(){return CordLength;}
    public int GetPowerConsumption(){
        return PowerConsumption;
    }

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
