package com.bsuir.by.Task5;

import java.util.Arrays;

public class Main {

    private static int[] A= new int[]{3,48,9,123,4,12,34,54,65};
    public static void main(String[] args) {

        int[] Index= new int[A.length];
        int[] Value= new int[A.length];

        for (int i=0;i<A.length;i++)
        {
            Index[i]=1;

            for (int j=0;j<i;j++){
                if(A[j]<A[i])
                {
                    Index[i]=Math.max(Index[i],1+Index[j]);
                }
            }
        }
        System.out.println(A.length-Index[Index.length-1]);

    }
}
