package com.bsuir.LAB2.Service.impl;

import com.bsuir.LAB2.DAO.DAOFactory;
import com.bsuir.LAB2.DAO.DAOType;
import com.bsuir.LAB2.DAO.IDAO;

import com.bsuir.LAB2.Entity.IProduct;
import com.bsuir.LAB2.Service.IService;
import com.bsuir.LAB2.Service.Validator;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.*;

/**
 * interface implementation IService
 */
public class ServiceImpl implements IService {

    private ArrayList<IProduct> Products;
    private IDAO DAO;


    private ArrayList<IProduct> Sort(ArrayList<IProduct> prod,String Criteria)
    {
        ArrayList<IProduct> res= new ArrayList<IProduct>();

        Method GoalMethod=null;
        Method[] methods= prod.get(0).getClass().getMethods();
        for(Method method:methods)
        {
            if(method.getName().equals("Get".concat(Criteria)))
                GoalMethod=method;
        }
        if(GoalMethod==null)
            return null;

        Map<String,IProduct> List1= new HashMap<String, IProduct>();

        try
        {
            for(IProduct Item:prod)
                List1.put(GoalMethod.invoke(Item, null).toString(),Item);
        }
        catch (Exception e)
        {
            return null;
        }

        Map<String,IProduct> List2 = new TreeMap<String, IProduct>(List1);

        for(String key:List2.keySet()){
            res.add(List2.get(key));
        }

        return res;
    }

    /**
     *
     * @param Product product type
     * @param Criteria type of criterion
     * @return
     */
    @Override
    public ArrayList<IProduct> Find(String Product,String Criteria)
    {
        if(!Validator.IsCriteriaValid(Products,Product,Criteria))
        return null;
        ArrayList<IProduct> Products= new ArrayList<IProduct>();

        for(IProduct prod:this.Products) {
            if (prod.GetProductName().equals(Product))
                Products.add(prod);
        }
        ArrayList<IProduct> sortProd=Sort(Products,Criteria);
        return sortProd;
    }

    /**
     * save product to file
     * @param prod list of products
     */
    public void SaveProd(ArrayList<IProduct> prod){
      DAO.SaveProduct(prod);
    };

    /**
     * getting all the products
     */
    public void GetProduct()
    {
        Products = DAO.GetProduct();
    }

    /**
     * Creating a connection to the DAO
     * @param Filename the name of the file in which the goods are stored
     */
    public ServiceImpl(String Filename)
    {
        this.DAO = DAOFactory.CreateDAO("Product.txt",DAOType.DAO);
    }
}
