package com.bsuir.LAB2.Entity;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class Oven implements IProduct, Serializable {

    private String ProductName;
    private int PowerConsumption;
    private float Weight;
    private float Capacity;
    private float Depth;
    private float Height;
    private float Width;

    public Oven(String ProductName,int PowerConsumption,float Weight,
                float Capacity,float Depth,float Height,float Width)
    {
        this.PowerConsumption=PowerConsumption;
        this.Weight=Weight;
        this.Capacity=Capacity;
        this.Height=Height;
        this.Width=Width;
        this.Depth=Depth;
        this.ProductName=ProductName;
    }

    @Override
    public String toString()
    {
        String res = "ProductName: "+ProductName+"  PowerConsumption:"+PowerConsumption+"  Weight:"+Weight+"  Capacity:"+Capacity+"  Height:"+Height;
        return res;
    }

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


    public String GetProductName(){return ProductName;}

    public int GetPowerConsumption(){
        return PowerConsumption;
    }

    public float GetWeight(){
        return Weight;
    }
    public float GetCapacity(){
        return Capacity;
    }
    public float GetDepth(){
        return Depth;
    }
    public float GetHeight(){
        return Height;
    }
    public float GetWidth(){
        return Width;
    }

}
