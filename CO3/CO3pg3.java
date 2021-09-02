import java.util.*;
abstract class Shapes
{
    abstract void draw();
    abstract void erase();
}

class circle extends Shapes 
{
    void draw() 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE RADIUS:");
        int radius = sc.nextInt();
        System.out.println("AREA OF THE CIRCLE:"+(3.14f));
    }

    void erase()
	{
        System.out.println("Erased Circle");
    }
}

class square extends Shapes 
{
    void draw() 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF THE SQUARE:");
        int side = sc.nextInt();
        System.out.println("AREA OF THE SQUARE:"+(side*side));
    }

    void erase() 
	{
        System.out.println("Erased square");
    }
}

class triangle extends Shapes 
{
    void draw() 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE BASE OF THE TRIANGLE:");
        int base = sc.nextInt();
        System.out.println("ENTER THE HEIGHT OF THE TRIANGLE:");
        int height = sc.nextInt();
        System.out.println("AREA OF THE TRIANGLE:"+((0.5f)*(base*height)));
    }

    void erase() 
	{
        System.out.println("Erased Triangle");
    }
}


public class CO3pg3 {
    public static void main(String ...a){
        Shapes SHAPE = new circle();
        SHAPE.draw();
        SHAPE.erase();
        SHAPE = new triangle();
        SHAPE.draw();
        SHAPE.erase();
        SHAPE = new square();
        SHAPE.draw();
        SHAPE.erase();
    }
}