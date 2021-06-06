import java.util.Scanner;
class Matrix
{
int a[][]=new int[5][5];
int r,c;
Matrix(int r,int c)
{
this.r=r;
this.c=c;
}
void read()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the elements");
for(int i=0;i<r;i++)
for(int j=0;j<c;j++)
a[i][j]=sc.nextInt();
}

Matrix addition(Matrix b)
{
Matrix M3=new Matrix(r,b.c);
for(int i=0;i<r;i++)
for(int j=0;j<b.c;j++)
{
M3.a[i][j]=0;
for(int k=0;k<c;k++)
	M3.a[i][j]=a[i][j]+b.a[i][j];
}
return M3;
}
void display()
{
	System.out.println("Sum of first and second matrix is");
for(int i=0;i<r;i++)
{
	for(int j=0;j<c;j++)
	
		System.out.print(a[i][j]+" ");
		System.out.println();		
}
System.out.println();
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter rows and columns of first matrix");
int r=sc.nextInt();
int c=sc.nextInt();
Matrix M1=new Matrix(r,c);
M1.read();
System.out.println("Enter rows and columns of second matrix");
r=sc.nextInt();
c=sc.nextInt();
Matrix M2=new Matrix(r,c);
M2.read();
Matrix M3=M1.addition(M2);
M3.display();
	
}
}