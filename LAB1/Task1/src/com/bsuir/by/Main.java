package com.bsuir.by;
import java.util.Scanner;
import java.math.*;

public class Main {

    public static double Sqr(double x)
    {
        return x*x;
    }

    public static void main(String[] args) {

        Scanner inport= new  Scanner(System.in);
        String xStr=inport.nextLine();
        double x=0;
        if(!"".equals((xStr)))
            x=Double.parseDouble(xStr);
        else
            x=0;
        String yStr=inport.nextLine();
        double y=0;
        if(!"".equals((yStr)))
            y=Double.parseDouble(yStr);
        else
            y=0;
        double numerator =1+Sqr(Math.sin(x+y));
        double divi=2+Math.abs(x-(2*x)/(1+Sqr(x)*Sqr(y)));
        System.out.println(numerator/divi);


    }
}
