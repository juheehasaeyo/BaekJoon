import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);   
       
       BigInteger n = s.nextBigInteger();       
       n = n.multiply(BigInteger.valueOf(4));
       System.out.println(n);
    }
}