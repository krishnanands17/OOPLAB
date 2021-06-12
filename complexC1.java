import java.util.Scanner;
class Complex
{
 int a,b;
 public static void main(String args[])
 {
  Scanner sc =new Scanner(System.in);
  Complex c1 =new Complex();
  Complex c2 =new Complex();
  System.out.println("Enter the 1st complex numbers :");
  c1.a=sc.nextInt();
  c1.b=sc.nextInt();
  System.out.println("Enter the 2nd complex numbers :");
  c2.a=sc.nextInt();
  c2.b=sc.nextInt();
  int x=c1.a+c2.a;
  int y=c1.b+c2.b;
  System.out.println("Sum:"+x+"+"+y+"i");
 }
}



