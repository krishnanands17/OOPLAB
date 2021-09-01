import java.util.*;
class Employee 
{
    Scanner sc=new Scanner(System.in);
    int empid,salary;
    String Name,address;
    protected int eno,esalary;
    protected String ename;

    Employee()
    {
        System.out.println("NAME OF THE EMPLOYEE:");
        Name= sc.next();
        System.out.println("EMPLOYEE ID:");
        empid= sc.nextInt();
        System.out.println("SALARY:");
        salary=sc.nextInt();
        System.out.println("ADDRESS:");
        address=sc.next();
    }
}

class teacher extends Employee
{
    Scanner sc=new Scanner(System.in);
    String dept,subj;
    teacher()
	{
        System.out.println("DEPARTMENT NAME:");
        dept=sc.next();
        System.out.println("SUBJECT:");
        subj= sc.next();
    }
    void PUTS()
    {
        System.out.println(".....DETAILS.....:");
        System.out.println(Name);
        System.out.println(empid);
        System.out.println(address);
        System.out.println(subj);
        System.out.println(dept);
        System.out.println(salary);
    }
}

public class EMP
{
    public static void main(String ...a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE LIMIT:");
        int n=sc.nextInt();
        teacher tr[]=new teacher[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new teacher();
            tr[i].PUTS();
        }
    }
}