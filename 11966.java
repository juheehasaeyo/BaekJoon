import java.util.Scanner;
//11966 2의 제곱인가?
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //n을 계속 2로 나누어보면서 나머지가 0인지 확인
        while(n % 2 == 0) {
            n /= 2;
        }
        if(n == 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}