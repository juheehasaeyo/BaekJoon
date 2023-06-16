import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	int [] a = new int[5];
    	
    	int sum = 0;
    	for(int i=0; i<a.length; i++) {
    		a[i] = s.nextInt();   
    		sum += a[i];
    	} 
    	System.out.println(sum/5);

    	//중앙값 계산
    	Arrays.sort(a);    	
    	int mid = a[a.length/2];
    	
    	System.out.println(mid);
    }
}