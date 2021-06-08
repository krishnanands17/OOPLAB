
import java.util.Scanner;
class person
{
    Scanner sc=new Scanner(System.in);
    String gender,address,name;
    int age;
    person()
    {
        System.out.println("Person Details:");
        System.out.println("Name:");
        name=sc.next();
        System.out.println("Address:");
        address=sc.next();
        System.out.println("Gender:");
        gender=sc.next();
        System.out.println("Age:");
        age=sc.nextInt();
    }
}

class Emp extends person
{
    int empid,sal;
    String com_name,qualification;
    Scanner sc=new Scanner(System.in);
    Emp()
    {
        System.out.println("Empolyee Details");
        System.out.println("Company Name:");
        com_name=sc.next();
        System.out.println("Employee ID:");
        empid=sc.nextInt();
        System.out.println("Qualification:");
        qualification=sc.next();
        System.out.println("Salary:");
        sal=sc.nextInt();
    }
}
class teacher extends Emp{
    Scanner sc=new Scanner(System.in);
    String dept,subj;
    int tID;
    teacher()
	{
        System.out.println("Teacher Details:");
        System.out.println("Department name:");
        dept=sc.next();
        System.out.println("Subject:");
        subj= sc.next();
        System.out.println("Teahcer ID:");
        tID= sc.nextInt();
    }
    void puts()
    {
        System.out.println("Details are:");
        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(com_name);
        System.out.println(empid);
        System.out.println(qualification);
        System.out.println(tID);
        System.out.println(address);
        System.out.println(subj);
        System.out.println(dept);
        System.out.println(sal);
    }
}
public class box {
    public static void main(String ...a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        teacher tr[]=new teacher[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new teacher();
            tr[i].puts();
        }
    }
}
