import java.util.Scanner;
// 5543 상근날드
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int coke = sc.nextInt();
        int cider = sc.nextInt();
        int res1 = 0, res2 = 0;
        if(coke < cider) {
            res1 = coke;
        } else res1 = cider;
        if (a <= b && a <= c) {
            res2 = a;
        } else if (b <= a && b <= c) {
            res2 = b;
        } else {
            res2 = c;
        }
        System.out.println(res1 + res2 - 50);
    }
}