import java.util.Scanner;
//11659
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      int M = sc.nextInt();
      
      int [] arr = new int[N];
      int [] psum = new int[N+1];
      psum[0] = 0;
      for(int i=1; i<=N; i++) {
    	  int x = sc.nextInt();
    	  psum[i] = psum[i-1] + x; //누적합
      }
      for(int k=0; k<M; k++) {
    	  int i = sc.nextInt();
          int j = sc.nextInt();
          System.out.println(psum[j]-psum[i-1]);
      }
   }
}