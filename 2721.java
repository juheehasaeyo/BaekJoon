import java.util.Scanner;
// 2721 삼각수의 합
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int sum = 0;
            for(int k=1; k<=n; k++) {
                sum += k*(k+1)*(k+2)/2;
            }
            System.out.println(sum);
        }
    }
}
