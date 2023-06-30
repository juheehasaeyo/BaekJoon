import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);   
    	
    	String N = s.next();
    	String [] num = N.split("");
    	int [] arr = new int[num.length];
    	
    	for (int i=0; i<num.length; i++) {
			arr[i] = Integer.parseInt(num[i]);
		}
    	Arrays.sort(arr);
		
		for (int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
    }
}