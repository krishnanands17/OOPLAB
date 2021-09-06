import java.util.Scanner;
class PERSON
{
    Scanner sc=new Scanner(System.in);
    String gender,address,name;
    int age;
    PERSON()
    {
        System.out.println("DETAILS:");
        System.out.println("NAME:");
        name=sc.next();
        System.out.println("ADDRESS:");
        address=sc.next();
        System.out.println("GENDER:");
        gender=sc.next();
        System.out.println("AGE:");
        age= sc.nextInt();
    }
}

class EMP extends PERSON
{
    int empid,sal;
    String cmp_name,qualification;
    Scanner sc=new Scanner(System.in);
    EMP()
    {
        System.out.println(".....DETAILS.....");
        System.out.println("COMPANY NAME:");
        cmp_name=sc.next();
        System.out.println("EMPLOYEE ID:");
        empid=sc.nextInt();
        System.out.println("QUALIFICATION:");
        qualification=sc.next();
        System.out.println("SALARY:");
        sal=sc.nextInt();
    }
}
class TEACHER extends EMP
{
    Scanner sc=new Scanner(System.in);
    String dept,subj;
    int teachID;
    TEACHER()
	{
        System.out.println(".....DETAILS.....:");
        System.out.println("DEPARTMENT NAME:");
        dept=sc.next();
        System.out.println("SUBJECT:");
        subj= sc.next();
        System.out.println("TEACHER ID:");
        teachID= sc.nextInt();
    }
    void PUTS()
    {
        System.out.println(".....DETAILS.....:");
        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(cmp_name);
        System.out.println(empid);
        System.out.println(qualification);
        System.out.println(teachID);
        System.out.println(address);
        System.out.println(subj);
        System.out.println(dept);
        System.out.println(sal);
    }
}
public class persons
{
    public static void main(String ...a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        TEACHER tr[]=new TEACHER[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new TEACHER();
            tr[i].PUTS();
        }
    }
}