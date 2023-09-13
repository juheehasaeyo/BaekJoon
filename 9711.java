import java.math.BigInteger;
import java.util.Scanner;
//9461
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        BigInteger[] f = new BigInteger[10004];
        f[1] = BigInteger.ONE;
        f[2] = BigInteger.ONE;
        for(int i=3; i<f.length; i++) {
            f[i] = f[i-1].add(f[i-2]);
        }
        for(int i=1; i<=t; i++) {
            int p = sc.nextInt();
            BigInteger q = sc.nextBigInteger();
            BigInteger m = f[p].mod(q);
            System.out.println("Case #" + i + ": " + m);
        }
    }
}