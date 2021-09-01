import java.util.*;
class CUST
{
    String name,bank;
    int accno,amount;
    CUST()
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NAME:");
        name = sc.next();
        System.out.println("ENTER THE BANK NAME:");
        bank = sc.next();
        System.out.println("ENTER THE ACCOUNT NUMBER:");
        accno = sc.nextInt();
        System.out.println("ENTER THE AMOUNT:");
        amount = sc.nextInt();
    }
}

class INVEST 
{
    static void interest(CUST c)
	{
        switch (c.bank)
		{
            case "federal":System.out.println("Interest at federal bank:"+(c.amount*(8.4f/100f)));
                break;
            case "Karur":System.out.println("Interest at Karur vysya bank :"+(c.amount*(7.3f/100f)));
                break;
            case "BOI":System.out.println("Interest at BOI:"+(c.amount*(9.7f/100f)));
                break;
            default:System.exit(0);
                break;
        }

    }

}

public class CO3pg2 
{
    public static void main(String ...a)
	{
        CUST c = new CUST();
        INVEST.interest(c);
    }
}