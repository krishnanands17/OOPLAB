import java.util.Scanner;

public class search {

	public static void main(String[] args) {
		int[] a=new int[100];
		int i,n,s;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter limit:");
		n=sc.nextInt();
		System.out.println("Enter the data:");
		for(i=1;i<=n;i++)
		{
			a[i]=sc.nextInt();			
		}
		System.out.println("Search:");
		s=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(s==a[i])
			{
				System.out.println(s+" Element found at "+i+" position");
				break;
			}
			if(i==n)
				System.out.println("Elemnt not found");
		}
	}

}
###############################################################################################################################
*OUTPUT*
Enter limit:
3
Enter the data:
2
4
5
Search:
4
4 Element found at 2 position
