package com.bsuir.Task9;

import java.util.ArrayList;
import com.bsuir.Task9.Ball;

public class Basket
{
    private ArrayList<Ball> AllBall;
    public Basket()
    {
        AllBall=new ArrayList<Ball>();

    }

    public void AddBall(int weight,String color)
    {
        AllBall.add(new Ball(weight, color));
    }

    public ArrayList<Ball> GetAllBall()
    {
        return AllBall;
    }

    public int CountColor(String color)
    {
        int result=0;
        for(Ball bl:AllBall){
            if(color.equals(bl.GetColor()))
                result++;
        }
        return result;
    }

    public int CountWeught()
    {
        int result=0;
        for(Ball bl:AllBall){
            result+=bl.GetWeight();
        }
        return result;
    }
}
