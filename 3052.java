import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
        int [] arr = new int[10];
        int count = 0;
        
        for(int i=0; i<10; i++) {
    	  int a = s.nextInt();   	
    	  arr[i] = a % 42;
          	  
    	  boolean bl = false;
    	  //j값과 i값을 비교
    	  for(int j=0; j<i; j++) {   	  
    		  if(arr[i] == arr[j]) {
    			  bl = true;
    			  break;
    		  }
    		  else {
    			  bl = false;
    		  }
    	  }    
       //중복 여부에 따라 count 증가
       if(bl == false) {
    	   count++;
       }
	}
       System.out.println(count);
   }
}