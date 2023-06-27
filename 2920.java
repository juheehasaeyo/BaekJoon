import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);        		
       int [] arr = new int[8];
       
       for(int i=0; i<8; i++) {
    	   arr[i] = s.nextInt();
       }
       int asc = 0, desc = 0;
       for(int i=0; i<8; i++) {
    	   if(arr[i] == i+1) {
    		   asc++;
    	   }
    	   else if(arr[i] == 8-i) {
    		   desc++;
    	   }
       }
       if(asc == 8) {
    	   System.out.println("ascending");
       }
       else if(desc == 8) {
    	   System.out.println("descending");
       }
       else {
    	   System.out.println("mixed");
       }
    }  
}