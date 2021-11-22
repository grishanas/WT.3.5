package com.bsuir.LAB2.Service;
import com.bsuir.LAB2.Entity.IProduct;
import java.util.ArrayList;

/**
 * Checking for product compliance and criteria
 */
public final class Validator {

    /**
     * Checking for product compliance and criteria
     * @param Products product list
     * @param Product product type
     * @param Criteria type of criterion
     * @return sign of inclusion of the criterion in the product
     */
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
