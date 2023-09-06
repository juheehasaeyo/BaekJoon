import java.util.Scanner;
//1788
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] f = new long[1000004];
        f[0] = 0;
        f[1] = 1;
        //n의 절댓값을 계산하여 tmp에 저장
        int tmp = Math.abs(n);
        for (int i = 2; i <= tmp; i++) {
            f[i] = (f[i - 1] + f[i - 2]) % 1000000000;
        }
        if(n > 0) {
            System.out.println(1);
            System.out.println(f[tmp]);
        } else if (n == 0) {
            System.out.println(0);
            System.out.println(f[tmp]);
        } else {
            if(n % 2 == 0) { //짝수일 때만 마이너스가 붙음!
                System.out.println(-1);
            } else {
                System.out.println(1);
            }
            System.out.println(Math.abs(f[tmp]));
        }
    }
}