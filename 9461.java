import java.util.Scanner;
//9461
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] p = new long[104];
        p[1] = 1;
        p[2] = 1;
        p[3] = 1;
        for(int i=4; i<p.length; i++) {
            p[i] = p[i-2] + p[i-3];
        }
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            System.out.println(p[n]);
        }
    }
}