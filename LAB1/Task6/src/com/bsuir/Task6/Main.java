package com.bsuir.Task6;

public class Main {

    public static int[] Massiv= new int[]{1,2,4,6,7,8,9,10};
    public static void main(String[] args) {

        int[][] Res= new int[Massiv.length][Massiv.length];
        for(int i=0;i< Massiv.length;i++)
        {
            for(int j=0;i+j< Massiv.length;j++)
            {
                Res[i][j]=Massiv[i+j];
               // System.out.print(Res[i][j]+" ");
            }
            for(int k=0;Massiv.length-i+k< Massiv.length;k++)
            {
                Res[i][Massiv.length-i+k]=Massiv[k];
                //System.out.print(Res[i][Massiv.length-i+k]+" ");
            }

            //System.out.println();
        }

        for(int i=0;i< Massiv.length;i++)
        {
            for(int j=0;j< Massiv.length;j++)
            {
                System.out.print(Res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
