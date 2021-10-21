package com.bsuir.by.Task4;

public class Main {

    private static int[] Massiv= new int[]{2,5,3,6,8,12,32,41};
    public static void main(String[] args) {

        for(int i=0;i<Massiv.length;i++)
        {
            if(IsSimple(Massiv[i]))
            System.out.println(i);
        }
    }

    public static boolean IsSimple(int x)
    {
        if(x<=1)
            return false;
        else if(x<=3)
            return true;
        else if (x%2==0 || x %3 ==0)
            return false;

        for(int i=5;i*i<=x;i+=6){
            if(x%i==0||x%(i+2)==0)
                return  false;
        }
        return true;

    }
}
