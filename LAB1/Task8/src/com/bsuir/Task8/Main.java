package com.bsuir.Task8;

public class Main {

    private static double[] ArrayA = new double[]{1.3,1.3,1.65,1.65};
    private static double[] ArrayB = new double[]{1.2,1.33,1.43,2.21,3};


    // решение для того случая, когда надо из НЕУБЫВАЮЩИХ последовательностей
    // сделать возрастающую последовательность с наименьшим количеством вставок
    private static void FirstSolution(){

        boolean[] Res= new boolean[ArrayA.length];
        for(int i=1;i< ArrayA.length;i++){
            if(ArrayA[i-1]==ArrayA[i])
            {
                int j=0;
                while (ArrayB[j]<=ArrayA[i]&&j< ArrayB.length)
                {
                    j++;
                }
                if(j<ArrayB.length)
                {
                    Res[i] = true;
                }
                else
                    Res[i]= false;
            }
        }
        if(Res.equals(false))
        {
            System.out.print("Невозможно сделать возрастающую последовательность");
            return;
        }
        for(int i=0;i< Res.length;i++){
            if(Res[i])
            System.out.print(i+1+" ");
        }
    }

    public static void main(String[] args)
    {
        FirstSolution();
    }
}
