import java.io.*;
import java.util.*;
class ReadWriteFile
{
    String Dname;
    void gets()
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FILENAME:");
        Dname = sc.next();
    }
    void write() throws Exception
	{
        FileOutputStream fileO = new FileOutputStream(Dname);
        DataOutputStream docO= new DataOutputStream(fileO);
        docO.writeUTF("WELCOME TO THE DIGITAL WORLD");
    }
    void read() throws Exception
	{
        FileInputStream fileI = new FileInputStream(Dname);
        DataInputStream docI = new DataInputStream(fileI);
        String str = docI.readUTF();
        System.out.println(str);
    }
}

public class CO4pg2 
{
    public static void main(String ...a) throws Exception {
        ReadWriteFile fio = new ReadWriteFile();
        fio.gets();
        fio.write();
        fio.read();
    }
}