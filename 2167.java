import java.util.Scanner;
//2167 2차원 배열의 합
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n+4][m+4];
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        for(int r=0; r<k; r++) {
            int sum = 0;
            int i = sc.nextInt();
            int j = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int p=i; p<=x; p++) {
                for(int q=j; q<=y; q++) {
                    sum += arr[p][q];
                }
            }
            System.out.println(sum);
        }
    }
}