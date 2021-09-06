import java.util.*;
interface ORD
{
    void ord_det();
}
class pro_det implements ORD 
{
    Scanner sc = new Scanner(System.in);
    int pid,quantity,price,totals,ord_no;
    String date,name;
   
    public void ord_det()
    {
        System.out.println("ENTER THE PRODUCT DETAILS:");
        System.out.println("DATE:");
        date=sc.next();
        System.out.println("ORDER NUMBER:");
        ord_no=sc.nextInt();
        System.out.println("PRODUCT ID:");
        pid=sc.nextInt();
        System.out.println("NAME:");
        name=sc.next();
        System.out.println("QUANTITY:");
        quantity=sc.nextInt();
        System.out.println("UNIT PRICE:");
        price=sc.nextInt();
        System.out.println("TOTAL:"+(price*quantity));
    }
    void PUTS()
    {
        System.out.println(".....DETAILS.....:");
        System.out.println("DATE:"+date);
        System.out.println("ORDER NUMBER:"+ord_no);
        System.out.println("PRODUCT ID:"+pid);
        System.out.println("NAME:"+name);
        System.out.println("QUANTITY:"+quantity);
        System.out.println("PRICE:"+price);
        System.out.println("TOTAL:"+(price*quantity));

    }

}
public class BILL 
{
    public static void main(String ...a)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        int sum=0,te=0;
        pro_det p[]=new pro_det[n];
        for (int i=0;i<n;i++)
        {
            p[i]= new pro_det();
            p[i].ord_det();
            p[i].PUTS();
            sum+=p[i].price*p[i].quantity;
        }
        te+=sum;
        System.out.println("Grand Total:"+sum);
    }
}