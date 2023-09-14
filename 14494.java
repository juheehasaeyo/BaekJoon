import java.util.Scanner;
//14494
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        long[][] d = new long[1004][1004];
        for(int i=1; i<1004; i++) {
            d[i][1] = 1;
            d[1][i] = 1;
        }
        for(int i=2; i<=n; i++) {
            for(int j=2; j<=m; j++) {
                d[i][j] = (d[i-1][j] + d[i][j-1] + d[i-1][j-1]) % 1000000007;
            }
        }
        System.out.println(d[n][m]);
    }
}