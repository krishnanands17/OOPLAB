import java.util.Scanner;
class Search
{
    public static void main(String[] args) 
    {
        int n, x, flag = 0, i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE LIMIT:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("ENTER THE ELEMENTS:");
        for(i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("ENTER THE ELEMENT TO BE SEARCHED:");
        x = sc.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
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
            System.out.println("Element found at position:"+(i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}



