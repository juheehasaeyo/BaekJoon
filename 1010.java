import java.math.BigInteger;
import java.util.Scanner;
//1010
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int max = 30;
        BigInteger [] fac = new BigInteger[34];
        fac[0] = BigInteger.ONE;
        for(int i=1; i<=max; i++) {
            fac[i] = BigInteger.valueOf(i).multiply(fac[i-1]);
        }
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            BigInteger result =fac[m].divide(fac[n].multiply(fac[m-n]));
            System.out.println(result);
        }
    }
}