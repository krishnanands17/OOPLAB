import java.io.*;
import java.util.*;

public class NumFile
{
  public static void main(String[] args) throws Exception 
  {
     int i=0;

     FileInputStream file = new FileInputStream("KRISH.txt");
     FileOutputStream EFile = new FileOutputStream("EvenFile.txt");
     FileOutputStream OFile = new FileOutputStream("OddFile.txt");
    
     while((i=file.read())!=-1) 
     {
      if(i%2==0)
      {
      EFile.write(i);
     }
      else
      OFile.write(i);
     }
    
     file.close();
     EFile.close();
     OFile.close();

      }

    }