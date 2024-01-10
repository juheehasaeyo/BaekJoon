import java.util.Scanner;
// 16479 컵라면 측정하기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        double r = Math.pow((d1 - d2), 2);
        double h2 = Math.abs(r/4 - k*k);
        if (h2 == (int) h2) {
            System.out.println((int) h2);
        } else {
            System.out.println(h2);
        }
    }
}