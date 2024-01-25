import java.util.Scanner;
// 23348 스트릿 코딩 파이터
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        int max = 0;
        for(int j=0; j<n; j++) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                int k1 = sc.nextInt();
                int k2 = sc.nextInt();
                int k3 = sc.nextInt();
                sum += k1*a + k2*b + k3*c;
            }
            if(sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}