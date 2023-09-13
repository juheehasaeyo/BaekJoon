import java.math.BigInteger;
import java.util.Scanner;
//11726
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] t = new int[1004];
        t[1] = 1;
        t[2] = 2;
        for(int i=3; i<t.length; i++) {
            t[i] = (t[i-1] + t[i-2]) % 10007;
        }
        System.out.println(t[n]);
    }
}