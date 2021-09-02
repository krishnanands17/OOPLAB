import java.awt.*;
import java.util.*;
interface prototypes
{
    double pi= 3.14;
    void area();

    void perimeter();
}
class circle implements prototypes 
{
    Scanner sc = new Scanner(System.in);
    double r;
    circle()
    {
        System.out.println("ENTER THE RADIUS:");
        r=sc.nextDouble();
    }
    public void area()
    {
        System.out.println("AREA OF THE CIRCLE:"+(pi*r*r));
    }
	
    public void perimeter() 
	{
            System.out.println("PERIMETER OF THE CIRCLE:"+(2*pi*r));
    }

}
class rectangle implements prototypes
{
    Scanner sc = new Scanner(System.in);
    double length,breadth;
    rectangle()
    {
        System.out.println("ENTER THE LENGTH:");
        length=sc.nextDouble();
        System.out.println("ENTER THE BREADTH:");
        breadth=sc.nextDouble();
    }
    public void area()
    {
        System.out.println("AREA OF THE RECTANGLE:"+(length*breadth));
    }
	
    public void perimeter() 
	{
        System.out.println("PERIMETER OF THE RECTANGLE:"+(2*(length+breadth)));
    }
}
public class SHAPE 
{
    public static void main(String ...a)
    {
        circle cir = new circle();
        rectangle rect = new rectangle();
        Scanner sc = new Scanner(System.in);
        int c;
        do {
            System.out.println("1.CIRCLE--AREA\n2.CIRCLE--PERIMETER\n3.RECTANGLE--AREA\n4.RECTANGLE--AREA\n5.EXIT");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    cir.area();
                    break;
                case 2:
                    cir.perimeter();
                    break;
                case 3:
                    rect.area();
                    break;
                case 4:
                    rect.perimeter();
                    break;
                case 5:System.exit(0);
                break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }while (c!=5);
    }
}