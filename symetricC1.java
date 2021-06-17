import java.util.Scanner;
class Sym
{
	int a[][];
	int x,y;
	Sym(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void get()
	{
		System.out.println("ENTER YOUR DATA:");
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<x;i++){
			for (int j=0;j<y;j++){
				a[i][j]=sc.nextInt();
			}
		}
	}
	void ch()
	{
		int flag=0;
		for (int i=0;i<x;i++){
			for (int j=0;j<y;j++){
				if(a[i][j]!=a[j][i]){
					 flag=1;
					break;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("This is not symetric");
		}
		else
		{
			System.out.println("This is Symetric");
		}
	}
}
class newSym
{
	public static void main(String ab[]){
		System.out.println("Enter how many rows and coloumns");
		Scanner sc=new Scanner(System.in);
		int j=sc.nextInt();
		int k=sc.nextInt();
		Sym m1=new Sym(j,k);
		m1.a=new int[j][k];
		m1.get();
		m1.ch();
	}
}
