import java.util.Scanner;
// 6502 동혁 피자
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 1;
        while (true) {
            int r = sc.nextInt();
            if (r == 0) {
                break;
            }
            int w = sc.nextInt();
            int l = sc.nextInt();
            if ((Math.pow(w, 2) + Math.pow(l, 2)) / 4 <= r * r) {
                System.out.println("Pizza " + cnt + " fits on the table.");
            } else {
                System.out.println("Pizza " + cnt + " does not fit on the table.");
            }
            cnt++;
        }
    }
}