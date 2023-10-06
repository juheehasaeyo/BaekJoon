import java.util.Scanner;
//9085 더하기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int sum = 0;
            int n = sc.nextInt();
            int [] num = new int[n];
            for(int j=0; j<n; j++) {
                num[j] = sc.nextInt();
                sum += num[j];
            }
            System.out.println(sum);
        }
    }
}