package com.bsuir.LAB2.Entity;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class Laptop implements IProduct, Serializable {
    private String ProductName;
    private float BatteryCapacity;
    private String OS;
    private float MemoryRom;
    private float SystemMemory;
    private float CPU;
    private float DisplayInchs;

    public Laptop(String ProductName,float BatteryCapacity,String OS,float MemoryRom,
            float SystemMemory,float CPU,float DisplayInchs)
    {
        this.BatteryCapacity=BatteryCapacity;
        this.OS=OS;
        this.MemoryRom=MemoryRom;
        this.SystemMemory=SystemMemory;
        this.CPU=CPU;
        this.DisplayInchs=DisplayInchs;
        this.ProductName=ProductName;
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

    public float GetBatteryCapacity(){
        return BatteryCapacity;
    }
    public String GetOS(){
        return OS;
    }
    public float GetMemoryRom(){
        return MemoryRom;
    }
    public float GetCPU(){
        return CPU;
    }
    public float GetDisplayInchs(){
        return DisplayInchs;
    }
    public float GetSystemMemory(){
        return SystemMemory;
    }
    public String GetProductName(){
        return ProductName;
    }
}
