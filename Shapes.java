package com.company;
import java.util.*;
class overloadDemo
{
    Scanner sc=new Scanner(System.in);
    int l,b;
    void input()
    {
        System.out.println("Enter the value:");
        l=sc.nextInt();
        b=sc.nextInt();
    }
    void AreaR()
	{
        System.out.println("Area of Rectangle:"+(l*b));
    }
    void AreaT(double pi,int x,int y)
	{
        System.out.println("Area of Triangle:"+(pi*b*h));
    }
}
public class Shapes {
    public static void main(String ...a) 
	{
        overloadDemo ar = new overloadDemo();
        ar.input();
        ar.AreaR();
        ar.AreaT(0.5, 4, 5);
    }

}
