package com.bsuir.LAB2.Entity;


import java.util.ArrayList;

/**
 * product interface
 *
 */

public interface IProduct {
  /**
   *  The method returns a string with the product name
   *   @return String with product name
   */
    public String GetProductName();

    /**
     *  Method returns a list of all criteria for the product implemented in the class
     *  @return Criteria list
     */
    public ArrayList<String> GetCriteria();
}
