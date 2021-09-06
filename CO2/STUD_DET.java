import java.util.*;
class STUDENT 
{
    int mark,roll_no;
    String name,classname;
    Scanner sc = new Scanner(System.in);
   void STUD()
   {
       System.out.println("NAME:");
       name= sc.next();
       System.out.println("ROLL NO:");
       roll_no=sc.nextInt();
       System.out.println("CLASS NAME:");
       classname=sc.next();
       System.out.println("ENTER THE MARKS OUT OF 80:");
       mark=sc.nextInt();
   }

}
class SPORTS extends STUDENT
{
    Scanner sc = new Scanner(System.in);
    int marks;
    void GETS()
    {
        System.out.println("ENTER THR MARK OUT OF 20:");
        marks=sc.nextInt();
    }
}

class RESULT extends SPORTS
{
    void PUTS()
    {
        System.out.println(".....DETAILS.....:");
        System.out.println("NAME:"+name);
        System.out.println("ROLL NUMBER:"+roll_no);
        System.out.println("CLASS NAME:"+classname);
        System.out.println("ACADEMIC MARK:"+mark);
        System.out.println("SPORTS MARK:"+marks);
    }
}
public class STUD_DET
{
    public static void main(String ...a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        RESULT result[]=new RESULT[n];
        for (int i=0;i<n;i++)
        {
            result[i]=new RESULT();
            result[i].STUD();
            result[i].GETS();
            result[i].PUTS();
        }
    }
}