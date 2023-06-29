import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);   
    	
    	int n = s.nextInt();
    	int [] basket = new int[n];
    	int m = s.nextInt();
    	
    	for(int r=0; r<m; r++) {
    		int i = s.nextInt();
    		int j = s.nextInt();
    		int k = s.nextInt();
    		
    		for(int p=i-1; p<j; p++) {
    			basket[p] = k;
    		}
    	}
    	for(int i=0; i<basket.length; i++) {
    		System.out.print(basket[i]+" ");
    	}    	
    }
}