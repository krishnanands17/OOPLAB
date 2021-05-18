import java.util.*;
class complex{
	double r,i;
public static void main(String a[])
{
	Scanner sc=new Scanner(System.in);
	complex c=new complex();
	complex c1=new complex();
	System.out.println("Complex number a:");
	c.r=sc.nextDouble();
	c.i=sc.nextDouble();
	System.out.println("Complex number b:");
	c1.r=sc.nextDouble();
	c1.i=sc.nextDouble();
	double smr=c1.r+c.r;
	double smi=c1.i+c.i;
	System.out.println("Sum:"+smr+"+"+smi+"i");
}
}
#######################################################################################################################################
*OUTPUT*
Complex number a:
4.8
2.9
Complex number b:
3.2
4
Sum:8.0 + 6.9i
