import java.util.Scanner;
import java.lang.*;
class MTT extends Thread
{
    public void run()
    {
        try{
            for(int i=0; i<=5; i++)
            {
                System.out.println(".......EXTENDING THREAD CLASS...... " + i);
            }
        }
        catch (Exception e)
        {

        }
    }
}
class MTR implements Runnable
{
    public void run()
    {
        try{
            for(int i =0; i<=5; i++)
            {
                System.out.println(" ......IMPLEMENTING RUNNABLE INTERFACE...... " + i);
            }
        }
        catch (Exception e)
        {

        }
    }
}
class CO4pg1
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int choice;
        MTT multiT = new MTT();
        Thread MultiTR = new Thread(new MTR());
        while(true) {
            System.out.println(" ");
            System.out.println(" 1. MULTITHREADING USING THREAD CLASS. \n 2. MULTITHREDING USING RUNNABLE INTERFACE \n 3. EXIT");
            choice = in.nextInt();
            switch (choice)
            {
                case 1: multiT.run();
                        break;
                case 2: MultiTR.run();
                        break;
                case 3: System.exit(0);
                        break;
                default:
                    System.out.println("INVALID INPUT");
            }
        }
    }
}
