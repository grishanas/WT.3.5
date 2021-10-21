package com.bsuir.Task9;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public enum Color{
        Синий,
        Красный,
        Черный
    }


    public static void main(String[] args)
    {
        Basket basket=new Basket();
        Random random= new Random();

        for(int i=0;i<25;i++)
        {
            int pick = random.nextInt(Color.values().length);
            String color=Color.values()[pick].toString();
            int weight=random.nextInt(5);
            basket.AddBall(weight,color);

        }

        System.out.println(basket.CountColor(Color.values()[0].toString()));
        System.out.println(basket.CountWeught());
        Scanner scanner= new Scanner(System.in);
        scanner.nextByte();

    }

}
