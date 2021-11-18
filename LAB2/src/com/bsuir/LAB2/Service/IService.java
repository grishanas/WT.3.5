package com.bsuir.LAB2.Service;

import com.bsuir.LAB2.Entity.Criteria.SearchCreteria;
import com.bsuir.LAB2.Entity.IProduct;

import java.util.ArrayList;


public interface IService {

    public ArrayList<IProduct> Find(String Product, String Criteria);

}
