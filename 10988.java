import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    	
       Scanner s = new Scanner(System.in);

       String str = s.next();      
       StringBuffer sb = new StringBuffer(str);
       String reverse = sb.reverse().toString();
       
       if(str.equals(reverse)) {
    	   System.out.println("1");
       }
       else {
		System.out.println("0");
       }       
    }
}