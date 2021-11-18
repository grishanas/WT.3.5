package com.bsuir.LAB2.DAO;

import com.bsuir.LAB2.Entity.IProduct;

import java.util.ArrayList;

public interface IDAO {
    public ArrayList<IProduct> GetProduct();
    public void SaveProduct(ArrayList<IProduct> Product);
}
