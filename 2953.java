import java.util.Scanner;

public class Main {
	   public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      
	      int [] score = new int[5];
	      int max = 0;
	      int index = 0;
	      for(int i=0; i<score.length; i++) {
	    	  int sum = 0;
	    	  for(int j=0; j<4; j++) {
		    	  score[i] = sc.nextInt();
		    	  sum += score[i];

		    	  if(max < sum) {
		    		  max = sum;
		    		  index = i+1;
		    	  }
	    	  }
	      }
	      System.out.println(index + " " +max);
	   }
}