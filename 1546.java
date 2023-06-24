import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);   
       
       int n = s.nextInt();
       double [] arr = new double[n];
       double sum = 0;
       double m = arr[0];
       
       for(int i=0; i<n; i++) {
    	   arr[i] = s.nextInt();    	       	   
    	   if(m < arr[i]) {
    		   m = arr[i]; 
    	   }
       }
       for(int i=0; i<n; i++) {
    	   arr[i] = arr[i]/m*100;
		   sum += arr[i];
	   }
       double avg = sum/n;
       System.out.println(avg);
    }
}