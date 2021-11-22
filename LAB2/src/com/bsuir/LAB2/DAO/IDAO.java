package com.bsuir.LAB2.DAO;

import com.bsuir.LAB2.Entity.IProduct;

import java.util.ArrayList;

/**
 * interface for creating the DAO
 */
public interface IDAO {
    /**
     * method returning all products
     * @return a list of all objects from the file
     */
    public ArrayList<IProduct> GetProduct();

    /**
     * Saving products to a file
     * @param Product list of preserved products
     */
    public void SaveProduct(ArrayList<IProduct> Product);
}
