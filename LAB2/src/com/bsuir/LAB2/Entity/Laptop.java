package com.bsuir.LAB2.Entity;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Laptop
 */
public class Laptop implements IProduct, Serializable {
    private String ProductName;
    private float BatteryCapacity;
    private String OS;
    private float MemoryRom;
    private float SystemMemory;
    private float CPU;
    private float DisplayInchs;

    /**
     * class creation
     * @param ProductName ProductName
     * @param BatteryCapacity BatteryCapacity
     * @param OS OS
     * @param MemoryRom MemoryRom
     * @param SystemMemory SystemMemory
     * @param CPU CPU
     * @param DisplayInchs DisplayInchs
     */
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

    /**
     * Battery Capacity
     * @return Battery Capacity
     */
    public float GetBatteryCapacity(){
        return BatteryCapacity;
    }

    /**
     * OS
     * @return OS
     */
    public String GetOS(){
        return OS;
    }

    /**
     * amount of memory
     * @return amount of memory
     */
    public float GetMemoryRom(){
        return MemoryRom;
    }

    /**
     * CPU
     * @return CPU
     */
    public float GetCPU(){
        return CPU;
    }
    /**
     * monitor size
     * @return monitor size
     */
    public float GetDisplayInchs(){
        return DisplayInchs;
    }
    /**
     * SystemMemory
     * @return SystemMemory
     */
    public float GetSystemMemory(){
        return SystemMemory;
    }
    /**
     * ProductName
     * @return ProductName
     */
    public String GetProductName(){
        return ProductName;
    }
}
