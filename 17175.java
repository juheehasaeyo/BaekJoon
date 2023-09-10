import java.util.Scanner;
//17175
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] fibo = new int[54];
        fibo[0] = 1; //n==0일 때 fibo[0]이 호출=> 1번
        fibo[1] = 1;
        for(int i=2; i<=n; i++) {
            fibo[i] = (1 + fibo[i-2] + fibo[i-1]) % 1000000007;
        }
        System.out.println(fibo[n]);
    }
}
