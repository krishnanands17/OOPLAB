import java.util.Scanner;
class EMP
{
	int eno,esalary;
	String ename;

	public static void main(String[] args) {
		 int flag=0,n,x,i;
		Scanner sc=new Scanner(System.in);
		EMP[] emp=new EMP[50];
		System.out.println("ENTER THE NUMBER OF EMPLOYEES:");
		 n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter Employee No:");
			emp[i]=new EMP();
			emp[i].eno=sc.nextInt();
			System.out.println("Enter Employee Salary:");
			emp[i].esalary=sc.nextInt();
			System.out.println("Enter Employee Name:");
		    emp[i].ename=sc.next();
		}
		System.out.println("Enter the employee id you want to find :");
		 x=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(emp[i].eno==x)
			{
				 flag = 1;
                break;
			}
			 else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
				System.out.println("Employee found at postion"  + (i + 1));
        }
        else
        {
            System.out.println("employee not found");
        }
    }
}
				


