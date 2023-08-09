import java.util.Scanner;
//10250
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int T = sc.nextInt();
      int XX = 0;
      int YY = 0;
      for(int i=0; i<T; i++) {
         int H = sc.nextInt();
         int W = sc.nextInt();
         int N = sc.nextInt();

         if(N % H == 0) {
        	 YY = H;
        	 XX = N/H;
         }
         else {
		YY = N%H;
		XX = N/H + 1;
         }
         if(XX<10) {
        	 System.out.println(YY+"0"+XX);
         } else {
        	 System.out.println(YY+""+XX);
         }
      }
   }   
}
