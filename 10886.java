import java.util.Scanner;

public class Main {
   
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
               
        int N = sc.nextInt();
        int count1 = 0;
    	int count2 = 0;
    	
        for(int i=0; i<N; i++) {
        	int cute = sc.nextInt();       	
        	if(cute == 0) {
        		count1++;
        	} else if (cute == 1) {
		count2++;
	}
        }
        if(count1 > count2) {
    		System.out.println("Junhee is not cute!");
    	} else {
    		System.out.println("Junhee is cute!");
		}
	}
}