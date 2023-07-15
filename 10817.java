import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	int A = s.nextInt();
    	int B = s.nextInt();
        int C = s.nextInt();
        
    	int [] arr = {A, B, C};       
    	        
        Arrays.sort(arr);
        System.out.println(arr[1]);
	}
}