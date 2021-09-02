import java.util.*;
abstract class publisher
{
    static int pid;
    static String name;
    Scanner sc=new Scanner(System.in);
   publisher()
   {
         System.out.println("ENTER THE DETAILS");
         System.out.println("PUBLISHER NAME:");
         name=sc.next();
         System.out.println("PUBLISHER ID:");
         pid=sc.nextInt();

   }
}
class book extends publisher
{
    String bname;
    int bid;
    Scanner sc=new Scanner(System.in);
    book()
    {
       System.out.println("BOOK DETAILS:");
        System.out.println("BOOK NAME:");
        bname=sc.next();
        System.out.println("BOOK ID:");
        bid=sc.nextInt();
    }
}
class literature extends book
{
    String chap;
    int chapno;
    Scanner sc=new Scanner(System.in);
    literature()
    {
        System.out.println("CHAPTER NAME:");
        chap=sc.next();
        System.out.println("CHAPTER NUMBER:");
        chapno=sc.nextInt();
    }
}
class fiction extends literature
{
    String topic;
    Scanner sc=new Scanner(System.in);
    fiction()
    {
        System.out.println("TOPIC:");
        topic=sc.next();
    }
    void PUTS()
    {
        System.out.println("......DETAILS......:");
        System.out.println("PUBLISHER NAME:");
        System.out.println(name);
        System.out.println("PUBLISHER ID:");
        System.out.println(pid);
        System.out.println("BOOK NAME:");
        System.out.println(bname);
        System.out.println("BOOK ID:");
        System.out.println(bid);
        System.out.println("CHAPTER:");
        System.out.println(chap);
        System.out.println("CHAPTER NUMBER");
        System.out.println(chapno);
        System.out.println("TOPIC:");
        System.out.println(topic);
    }
}
public class INHERIT {
    public static void main(String ...a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        fiction tr[]=new fiction[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new fiction();
            tr[i].PUTS();
        }
    }
}