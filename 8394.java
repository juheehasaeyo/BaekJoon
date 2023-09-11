import java.util.Scanner;
//8394
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] aksu = new long[10000004];
        aksu[1] = 1;
        aksu[2] = 2;
        for(int i=3; i<=n; i++) {
            aksu[i] = (aksu[i-1] + aksu[i-2]) % 10;
        }
        System.out.println(aksu[n]);
    }
}