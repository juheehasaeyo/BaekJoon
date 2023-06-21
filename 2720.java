import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
        
    	int t = s.nextInt();

    	for(int i=0; i<t; i++) {
    		int c = s.nextInt();  
    		
    		int quarter = c/25;
    		c = c%25;
    		int dime = c/10;
    		c = c%10;
    		int nickel = c/5;
    		c = c%5;
    		int penny = c/1;

    		System.out.println(quarter + " " + dime + " " + nickel + " " + penny);        
    	}   	    		    	 
   }
}