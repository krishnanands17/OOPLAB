import java.io.*;
import java.net.*;
import java.util.Scanner;

public class CO4pg6 
{
static String str;
public static void main(String ...a) throws Exception 
{
Scanner sc = new Scanner(System.in);
Socket s = new Socket("localhost",9999);
System.out.println("*****ENTER THE DATA*****");
Thread.sleep(1000);
str = sc.next();
OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
PrintWriter p = new PrintWriter(os);
os.write(str+"\n");
os.flush();
}
}