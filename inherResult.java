
import java.util.*;
interface student {
    Scanner sc = new Scanner(System.in);
    int roll = 29, mark = 70;
    String name = "Krishnanand", classname = "MCA";

}
class sports
{
    Scanner sc = new Scanner(System.in);
    int m;
    void gets()
    {
        System.out.println("Enter marks out of 20:");
        m=sc.nextInt();
    }
}

class Result extends sports implements student
{
    void puts()
    {
        System.out.println("Details of students are:");
        System.out.println("Name:"+name);
        System.out.println("Roll number:"+roll);
        System.out.println("Class Name:"+classname);
        System.out.println("Academic Mark:"+mark);
        System.out.println("Sports Mark:"+m);
    }
}
public class inherResult {
    public static void main(String ...a)
    {
        Result res = new Result();
        res.gets();
        res.puts();
    }
}

