package com.bsuir.LAB2.Entity;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class TabletPC implements IProduct, Serializable {

    private String ProductName;
    private float BatteryCapacity;
    private float DisplayInchs;
    private float MemoryRom;
    private int FlashMemoryCapacity;
    private String Color;

    public TabletPC(String ProductName,float BatteryCapacity,float DisplayInchs,
                    float MemoryRom,int FlashMemoryCapacity,String Color)
    {
        this.BatteryCapacity=BatteryCapacity;
        this.DisplayInchs=DisplayInchs;
        this.MemoryRom=MemoryRom;
        this.FlashMemoryCapacity=FlashMemoryCapacity;
        this.Color=Color;
        this.ProductName=ProductName;
    }

    public float GetBatteryCapacity(){return BatteryCapacity;}
    public float GetDisplayInchs(){return DisplayInchs;}
    public float GetMemoryRom(){return MemoryRom;}
    public int GetFlashMemoryCapacity(){return FlashMemoryCapacity;}
    public String GetColor(){return Color;}

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
