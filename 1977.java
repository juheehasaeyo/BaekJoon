import java.util.Scanner;

public class Main{
	public static void main(String[] args){
       Scanner s = new Scanner(System.in);
      
       int M = s.nextInt();
       int N = s.nextInt();
       int sum = 0, min = 10000;
       
       for(int i=1; i*i<=N; i++) {
    	   if(i*i>=M && i*i<=N) {
    		   min = Math.min(i*i, min);
    		   sum += i*i;
    	   }
       }
       if(sum == 0) {
    	   System.out.println("-1");
       } else {
		System.out.println(sum+"\n"+min);
       }
    }
}