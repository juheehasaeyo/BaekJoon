import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long [] fibo = new long[68];
        fibo[0] = 1;
        fibo[1] = 1;
        fibo[2] = 2;
        fibo[3] = 4;
        for(int i=4; i<=67; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2] + fibo[i - 3] + fibo[i - 4];
        }
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            System.out.println(fibo[n]);
        }    
    }
}