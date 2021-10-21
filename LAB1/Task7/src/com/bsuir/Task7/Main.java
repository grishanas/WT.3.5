package com.bsuir.Task7;

public class Main {

    private static double[] InputMass= new double[]{3,532,13,766,12,543,123,74};
    public static void main(String[] args) {

        for(int step=InputMass.length/2;step>0;step/=2)
            for(int i= 0;i< InputMass.length;i++){
                for (int j=i+step;j< InputMass.length;j+=step)
                {
                    if(InputMass[i]>InputMass[j]) {
                        double tmp = InputMass[j];
                        InputMass[j] = InputMass[i];
                        InputMass[i] = tmp;
                    }
                }
            }

        for(int i=0;i< InputMass.length;i++)
            System.out.print(InputMass[i]+" ");
    }
}
