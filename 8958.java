import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
                      
       int n = s.nextInt();
       String [] quiz = new String[n];       
       for(int i=0; i<quiz.length; i++) {
    	   quiz[i] = s.next();
       }
       
       for(int i=0; i<quiz.length; i++) {
           int sum = 0, count = 0;
           
    	   for(int j=0; j<quiz[i].length(); j++) {
    		   if(quiz[i].charAt(j) == 'O') {
        		   count++;
        	   } else {
        		   count = 0;
        	   }
    		   sum += count;
    	   }
    	   System.out.println(sum);
       }
    }
}