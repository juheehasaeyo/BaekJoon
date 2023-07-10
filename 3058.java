import java.util.Scanner;

public class Main{
	public static void main(String[] args){
       Scanner s = new Scanner(System.in);        
       int T = s.nextInt();
       int [] arr = new int[7];
       
       for(int j=0; j<T; j++) {
           int sum = 0;
           int min = 100;
           
    	   for(int i=0; i<7; i++) {
    		   arr[i] = s.nextInt();
    		   if(arr[i] %2 == 0) {
    			   sum += arr[i];  			   
    		   if(arr[i] < min) {
    			   min = arr[i];
    		   }
    		 }
    	   }
       System.out.println(sum+" "+min);
       }
    }
}