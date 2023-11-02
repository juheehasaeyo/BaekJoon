import java.util.Scanner;
// 5543 상근날드
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        int coke = sc.nextInt();
        int cider = sc.nextInt();
        int res1 = 0, res2 = 0;
        
        if(coke < cider) {
            res1 = coke;
        } else res1 = cider;
        
        if (b1 <= b2 && b1 <= b3) {
            res2 = b1;
        } else if (b2 <= b1 && b2 <= b3) {
            res2 = b2;
        } else {
            res2 = b3;
        }
        System.out.println(res1 + res2 - 50);
    }
}
