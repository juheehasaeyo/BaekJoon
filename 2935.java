import java.math.BigInteger;
import java.util.Scanner;
// 2935 소음
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        String str = sc.next();
        BigInteger b = sc.nextBigInteger();
        if(str.equals("*")) {
            System.out.println(a.multiply(b));
        } else if (str.equals("+")) {
            System.out.println(a.add(b));
        }
    }
}