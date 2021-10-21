package com.bsuir.by.Task2;

import java.util.Scanner;

public class Main {

    private static int yMax=5;
    private static  int yMin=-3;
    private static int xMaxPos=4;
    private static int xMaxNeg=6;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x=-6;
        int y=-3;
        if(y>yMax||y<yMin) {
            System.out.println("false");
            return;
        }
        if(y>0&&(x<=xMaxPos&&x>=-xMaxPos))
        {
            System.out.println("true");
            return;
        }
        if(y<0&&(x<=xMaxNeg&&x>=-xMaxNeg))
        {
            System.out.println("true");
            return;
        }
        else
            System.out.println("false");

    }
}
