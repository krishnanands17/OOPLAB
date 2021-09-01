import java.awt.*;
import java.util.*;
class manipulation 
{
    Scanner sc = new Scanner(System.in);
    private static String str;
    void get()
    {
        System.out.println("Enter a string:");
        str=sc.next();
    }
    void compare()
    {
        System.out.println("Enter another stirng to compare:");
        String str2=sc.next();
        if(str.compareTo(str2)==0)
        {
            System.out.println("Both are same");
        }
        else
        {
            System.out.println("Both are not same");
        }
    }
    void concat()
    {
        System.out.println("Enter another stirng to compare:");
        String str2=sc.next();
        String str3=str+str2;
        System.out.println(str3);
    }
    void length()
    {
        System.out.println("Length of "+str+" is:"+str.length());
    }
    void upper_lower()
    {
        System.out.println("Upper case:"+str.toUpperCase());
        System.out.println("Upper case:"+str.toLowerCase());
    }
    void reverse()
    {
        StringBuilder sb=new StringBuilder(str);
        System.out.println("Reverse of "+str+" is:"+sb.reverse());
    }
    
}
public class string_manipulations 
{
    public static void main(String... a) {
        int n;
        manipulation m = new manipulation();
        Scanner sc = new Scanner(System.in);
        m.get();
        do {
            System.out.println("1.LENGTH\n2.COMPARE\n3.CONCATINATE\n4.UPPER CASE & LOWER CASE\n5.REVERSE\n6.Exit");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    m.length();
                    break;
                case 2:
                    m.compare();
                    break;
                case 3:
                    m.concat();
                    break;
                case 4:
                    m.upper_lower();
                    break;
                case 5:
                    m.reverse();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }while (n != 6) ;
    }

}
