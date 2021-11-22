package com.bsuir.LAB2.Service;

import com.bsuir.LAB2.Entity.IProduct;

import java.util.ArrayList;

/**
 * data processing interface
 */
public interface IService {

    /**
     * method searches for all data according to the parameters passed
     * @param Product product type
     * @param Criteria type of criterion
     * @return a list of all products with this criterion
     */
    public ArrayList<IProduct> Find(String Product, String Criteria);

}
