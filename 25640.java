import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
               
       String str = s.next();
       int N = s.nextInt();
       int count = 0;
       
       for(int i=0; i<N; i++) {
    	   String st = s.next();
    	   if(st.equals(str)) {
    		   count++;
    	   }
       }
       System.out.println(count);
    }
}