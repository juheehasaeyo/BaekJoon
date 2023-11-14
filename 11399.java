import java.util.Arrays;
import java.util.Scanner;
// 11399 ATM
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] p = new int[n];
        int [] arrp = new int[n+4];
        int [] psum = new int[n+4];
        int res1 = 0, res2 = 0;
        for(int i=0; i<n; i++) {
            p[i] = sc.nextInt();
        }
        arrp[0] = 0;
        for(int i=1; i<=n; i++) {
            arrp[i] = arrp[i-1] + p[i-1];
            res1 += arrp[i];
        }
        Arrays.sort(p);
        psum[0] = 0;
        for(int i=1; i<=n; i++) {
            psum[i] = psum[i-1] + p[i-1];
            res2 += psum[i];
        }
        System.out.println(res1 < res2 ? res1 : res2);
    }
}