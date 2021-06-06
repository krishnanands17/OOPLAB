package com.company;
import java.util.*;
class Emp123 
{
    Scanner sc=new Scanner(System.in);
    int empid,salary;
    String Name,address;;
    Emp123()
    {
        System.out.println("Name:");
        Name= sc.next();
        System.out.println("Emp id:");
        empid= sc.nextInt();
        System.out.println("Salary:");
        salary=sc.nextInt();
        System.out.println("Address:");
        address=sc.next();
    }
}

class teacher extends emp123{
    Scanner sc=new Scanner(System.in);
    String dept,subj;
    teacher(){
        System.out.println("Department name:");
        dept=sc.next();
        System.out.println("Subject:");
        subj= sc.next();
    }
    void display()
    {
        System.out.println("Details are:");
        System.out.println(Name);
        System.out.println(empid);
        System.out.println(address);
        System.out.println(subj);
        System.out.println(dept);
        System.out.println(salary);
    }
}

public class EMP{
    public static void main(String ...a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        teacher tr[]=new teacher[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new teacher();
            tr[i].display();
        }
    }
}