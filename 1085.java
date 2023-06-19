import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);   
    	
    		int x = s.nextInt();
    		int y = s.nextInt();
    		int w = s.nextInt();
    		int h = s.nextInt();
    		
    		int a1 = x < (w-x)? x : (w-x);
    		int a2 = y < (h-y)? y : (h-y);
    	
    		if(a1 < a2)
    			System.out.println(a1);
    		else 
    			System.out.println(a2);
    }
}