import java.util.*;
abstract class SHAPE
{
    public int length,breadth;
    abstract void printArea();
}
class Rectangle extends SHAPE
{
    Scanner sc = new Scanner(System.in);
    void printArea()
	{
        System.out.println("ENTER THE LENGTH OF THE RECTANGLE:");
        super.length = sc.nextInt();
        System.out.println("ENTER THE BREADTH OF THE RECTANGLE:");
        super.breadth = sc.nextInt();
        System.out.println("AREA OF THE RECTANGLE:"+(length*breadth));
    }
}

class Triangle extends SHAPE
{
    Scanner sc = new Scanner(System.in);
    void printArea()
	{
        System.out.println("ENTER THE HEIGHT OF THE TRIANGLE:");
        super.length = sc.nextInt();
        System.out.println("ENTER THE BREADTH OF THE RECTANGLE:");
        super.breadth = sc.nextInt();
        System.out.println("AREA OF THE TRIANGLE:"+(0.5f*length*breadth));
    }
}
class Circle extends SHAPE
{
    Scanner sc = new Scanner(System.in);
    void printArea()
	{
        System.out.println("ENTER THE HEIGHT OF THE CIRCLE:");
        super.length = sc.nextInt();
        System.out.println("AREA OF THE CIRCLE:"+((3.14f)*length*length));
    }
}
public class CO3pg1
 {
    public static void main(String ...a)
	{
        SHAPE rect = new Rectangle();
        SHAPE tri = new Triangle();
        SHAPE cir = new Circle();
        rect.printArea();
        tri.printArea();
        cir.printArea();
    }
}