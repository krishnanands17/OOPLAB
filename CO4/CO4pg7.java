import java.io.*;
class CO4pg7
{
    public static void main(String arg[]) throws Exception
    {
        char data;
        int WCount = 0, LCount = 1, CCount;
        File Co4pg7 = new File("sample.txt");
        FileInputStream fis = new FileInputStream(Co4pg7);
        CCount = fis.available();
        for(int i = 0; i<CCount; i++)
        {
            data = (char)fis.read();
            if(data == '\n')
                LCount++;
            else if(data == ' ')
                WCount++;
        }
        System.out.println("NUMBER OF WORDS      : " + (WCount + LCount));
        System.out.println("NUMBER OF CHARACTERS : " + CCount);
        System.out.println("NUMBER OF LINES      : " + LCount);
    }
}