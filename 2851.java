import java.util.Scanner;
//2851 슈퍼마리오
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int [] psum = new int[11];
      psum[0] = 0;

      for(int i=1; i<=10; i++) {
         int x = sc.nextInt();
         psum[i] = psum[i-1] + x;
      }         
      if(psum[10] < 100) {
         System.out.println(psum[10]);
      } 
      else {
         for(int i=1; i<=10; i++){
            //누적합이 100 이상이면
            if(psum[i] >= 100) {
               if(psum[i]-100 > 100 - psum[i-1]) {
                  System.out.println(psum[i-1]);
                  break;
               } else {
                  System.out.println(psum[i]);
                  break;
               }
            }
         }
      }
   }
}
