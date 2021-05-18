import java.util.Scanner;

public class employee {
	int eno,esalary;
	String ename;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		employee[] em=new employee[3];
		System.out.println("Limit");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details:");
			em[i]=new employee();
			em[i].eno=sc.nextInt();
			em[i].esalary=sc.nextInt();
			em[i].ename=sc.next();
		}
		System.out.println("Enter the eno:");
		int enoo=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(em[i].eno==enoo)
			{
				System.out.println("Employee found");
				break;
			}
			if(i==n-1)
			{
				System.out.println("Employee not found:");
			}
		}


	}

}
###########################################################################################################################
*OUTPUT*
Limit
2
Enter the details:
1
2
Krich
Enter the details:
2
3
ansil
Enter the eno:
2
Employee found
