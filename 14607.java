import java.util.Scanner;
//14607 피자(Large)
//DP로 풀 수 있지만, 규칙 존재!
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        /*long [] pizza = new long[n+4];
        pizza[1] = 0;
        pizza[2] = 1;
        for(int i=3; i<=n; i++) {
            pizza[i] = i-1 + pizza[i-1];
        }*/
        System.out.println(n*(n-1) / 2);
    }
}