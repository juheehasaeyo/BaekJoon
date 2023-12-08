import java.util.Scanner;
// 10539 수빈이와 수열
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n];
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            b[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<n; i++) {
            a[i] = b[i] * (i+1) - sum;
            sum += a[i];
        }
        for(int i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}