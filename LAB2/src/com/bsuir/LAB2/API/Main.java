package com.bsuir.LAB2.API;

import com.bsuir.LAB2.Entity.*;
import com.bsuir.LAB2.Service.Validator;
import com.bsuir.LAB2.Service.impl.ServiceImpl;

import java.util.ArrayList;

/**
 * main class in the program
 */
public class Main {

    /**
     * program entry
     * @param args nothing
     */
    public static void main(String[] args) {

        ServiceImpl  serv= new ServiceImpl("");
        serv.GetProduct();
//        ArrayList<IProduct> prod= new ArrayList<IProduct>();
//        prod.add(new Oven("Oven",1000,10,32,60,(float) 45.5,(float)59.5));
//        prod.add(new Oven("Oven",1500,12,33,60,(float) 45,(float)68));
//        prod.add(new Oven("Oven",2000,11,33,60,(float) 40,(float)70));
//        prod.add(new Laptop("Laptop",1,"Windows",4000,1000,(float) 1.2,(float)18));
//        prod.add(new Laptop("Laptop",(float)1.5,"Linux",8000,1000,(float) 2.2,(float)19));
//        prod.add(new Laptop("Laptop",3,"Windows",8000,1500,(float) 3.2,(float)22));
//        prod.add(new Refrigerator("Refrigerator",100,20,10,300,200,70));
//        prod.add(new Refrigerator("Refrigerator",200,20,15,300,180,80));
//        prod.add(new Refrigerator("Refrigerator",150,35,20,(float)350.5,250,75));
//        prod.add(new VacuumCleaner("VacuumCleaner",100,"A","A2","all-in-one",3000,20));
//        prod.add( new VacuumCleaner("VacuumCleaner",110,"B","AA-89","all-in-one",2900,25));
//        prod.add(new VacuumCleaner("VacuumCleaner",90,"C","XX00","all-in-one",2950,30));
//        prod.add( new TabletPC("TabletPC",3,14,8000,2,"blue"));
//        prod.add( new TabletPC("TabletPC",4,15,8000,6,"red"));
//        prod.add(new TabletPC("TabletPC",5,16,16000,8,"green"));
//        prod.add(new Speakers("Speakers",15,2,"2-4",2));
//        prod.add(new Speakers("Speakers",20,3,"3-4",3));
//        prod.add(new Speakers("Speakers",17,4,"2-3.5",4));
//        serv.SaveProd(prod);


        ArrayList<IProduct> Products = serv.Find("Oven","Weight");

        if(Products!=null)
        for(IProduct Item:Products)
        {
            System.out.println(Item.toString());
        }
        else{
            System.out.println("errore");
        }
        System.out.println();
    }
}
