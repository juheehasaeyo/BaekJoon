import java.math.BigInteger;
import java.util.Scanner;
//10826
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        BigInteger [] fibo = new BigInteger[10004];
        fibo[0] = BigInteger.ZERO;
        fibo[1] = BigInteger.ONE;
        for(int i=2; i<fibo.length; i++) {
            fibo[i] = fibo[i-1].add(fibo[i-2]);
        }
        System.out.println(fibo[n]);
    }
}