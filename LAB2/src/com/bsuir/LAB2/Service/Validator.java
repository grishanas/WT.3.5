package com.bsuir.LAB2.Service;
import com.bsuir.LAB2.Entity.IProduct;
import java.util.ArrayList;

public final class Validator {

    public static boolean IsCriteriaValid(ArrayList<IProduct> Products, String Product, String Criteria)
    {
        for(IProduct item:Products)
        {
            if(item.GetProductName().equals(Product))
            {
                ArrayList<String> Criterias = item.GetCriteria();
                for(String str: Criterias)
                {
                    if(str.equals(Criteria))
                        return true;
                }
            }
        }

        return false;
    }
}
