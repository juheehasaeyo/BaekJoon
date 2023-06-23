import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);       		
    	
    	while(true) {   		
        		int a = s.nextInt();
        		int b = s.nextInt();
        		int c = s.nextInt();

        		if((a==0) && (b==0) && (c==0))
        			break;
        		
        		if((a+b > c) && (b+c > a) && (a+c > b)) {
            		if((a==b) && (b==c)) {
            			System.out.println("Equilateral");
            		}
            		else if((a==b) || (b==c) ||(a==c)) {
            			System.out.println("Isosceles");
            		}
            		else if((a!=b) && (b!=c) && (a!=c)) {
            			System.out.println("Scalene");
            		}
            	}
            	else {
        			System.out.println("Invalid");
        		}
    	}
    }
}