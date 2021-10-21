package com.bsuir.by.Task3;

public class Main {

    public static void main(String[] args) {

        double a=0;
        double b=3;
        double h=0.15;
        double x=a;
        double result;

        while(x<b)
        {
            result=Math.tan(x);
            System.out.println("x="+x+"  function value="+result);
            x=x+h;
        }

    }
}
