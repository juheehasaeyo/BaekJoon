import java.util.Scanner;
//14606
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] pizza = new int[14];
        pizza[1] = 0;
        pizza[2] = 1;
        for(int i=3; i<=n; i++) {
            pizza[i] = i-1 + pizza[i-1];
        }
        System.out.println(pizza[n]);
    }
}
