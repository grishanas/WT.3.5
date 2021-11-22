package com.bsuir.LAB2.DAO;

import com.bsuir.LAB2.Entity.IProduct;

import java.io.*;
import java.util.ArrayList;

/**
 *  Dao creation
 */
public final class DAO implements IDAO
{

    private String FileName;

    /**
     *
     * @param FileName file name
     */
    public DAO(String FileName){
        this.FileName=FileName;
    }

    /**
     *
     * @return  List of all objects
     */
    @Override
    public ArrayList<IProduct> GetProduct() {
        return Deserialize(FileName);
    }

    /**
     *
     * @param Product list of preserved products
     */
    @Override
    public void SaveProduct(ArrayList<IProduct> Product) {
        Serialize(FileName,Product);
    }

    private void Serialize(String FileName, ArrayList<IProduct> Products)
    {
        try
        {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FileName));
            oos.writeObject(Products);

        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    private ArrayList<IProduct> Deserialize(String Filename)
    {
        ArrayList<IProduct> Products = new ArrayList<IProduct>();

        try
        {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Filename));
            Products=(ArrayList<IProduct>)ois.readObject();

        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return Products;
    }

}
