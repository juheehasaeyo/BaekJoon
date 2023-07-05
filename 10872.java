import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int N = s.nextInt();
       int [] fac = new int[13];
       
       fac[0] = 1;
       for(int i=1; i<fac.length; i++) {
          fac[i] = i*fac[i-1];
       }
       System.out.println(fac[N]);      
    }
}
