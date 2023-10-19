import java.util.Scanner;
//14916 거스름돈
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        //n이 0보다 큰 동안 실행되는 while문
        while (n > 0) {
            if(n%5 == 0) { //n이 5의 배수라면
                cnt = cnt + n/5;
                break;
            } else {
                n -= 2;
                cnt++;
            }
        }
        if(n < 0) {
            System.out.println(-1);
        } else {
            System.out.println(cnt);
        }
    }
}