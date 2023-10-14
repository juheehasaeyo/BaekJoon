import java.util.Scanner;
//10156
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = k*n-m;
        if(k*n-m < 0) result = 0;
        System.out.println(result);
    }
}