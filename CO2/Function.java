import java.util.*;
class OverloadDemo
{
    Scanner sc=new Scanner(System.in);
    int length,breadth;
    void gets()
    {
        System.out.println("ENTER THE LENGTH AND BREADTH OF THE RECTANGLE:");
        length=sc.nextInt();
        breadth=sc.nextInt();
    }
    void Area(){
        System.out.println("AREA OF THE RECTANGLE:"+(length*breadth));
    }
    void Area(double pi,int breadth,int height){
        System.out.println("AREA OF THE TRIANGLE:"+(pi*breadth*height));
    }
}
public class Function 
{
    public static void main(String ...a) {
        Scanner sc=new Scanner(System.in);
        OverloadDemo shape = new OverloadDemo();
        shape.gets();
        shape.Area();
        System.out.println("ENTER THE BREADTH AND HEIGHT OF THE TRIANGLE");
        int c=sc.nextInt();
        int b=sc.nextInt();
        shape.Area(0.5, c,b);
    }

}
