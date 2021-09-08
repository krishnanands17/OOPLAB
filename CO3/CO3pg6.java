class REVERSE 
{  
public static String reverseWord(String str){  
    String words[]=str.split("\\s");  
    String reverseWord="";  
    for(String w:words){  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        reverseWord+=sb.toString()+" ";  
    }  
    return reverseWord.trim();  
}  
} 

public class CO3pg6 
{  
public static void main(String[] args) 
{  
    System.out.println("I'm a student of SNGCE");  
    System.out.println("Favourite game is BattleGround Mobile India"); 
	System.out.println("====================");
    System.out.println("Reversed String is:");
    System.out.println("====================");	
    System.out.println(REVERSE.reverseWord("I'm a student of SNGCE"));  
    System.out.println(REVERSE.reverseWord("Favourite game is BattleGround Mobile India"));    
    }  
} 