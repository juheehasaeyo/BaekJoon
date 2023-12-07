import java.util.Scanner;
// 1834 나머지와 몫이 같은 수
// 규칙 찾기!
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for(int i=1; i<n; i++) {
            sum += (n+1) * i;
        }
        System.out.println(sum);
    }
}