package com.bsuir.LAB2.Entity;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class Refrigerator implements IProduct, Serializable {
    private String ProductName;
    private int PowerConsumption;
    private float Weight;
    private int FreezCapacity;
    private float OveralCapacity;
    private float Depth;
    private float Height;

    public Refrigerator(String ProductName,int PowerConsumption,float Weight,
            int FreezCapacity,float OveralCapacity,float Depth,float Height)
    {
        this.PowerConsumption=PowerConsumption;
        this.Weight=Weight;
        this.FreezCapacity=FreezCapacity;
        this.OveralCapacity=OveralCapacity;
        this.Depth=Depth;
        this.Height=Height;
        this.ProductName=ProductName;
    }

    public int GetPowerConsumption(){
        return PowerConsumption;
    }

    public float GetOveralCapacity(){
        return OveralCapacity;
    }

    public int GetFreezCapacity(){
        return FreezCapacity;
    }

    public String GetProductName(){
        return ProductName;
    }

    public float GetDepth(){
        return Depth;
    }
    public float GetHeight(){
        return Height;
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
