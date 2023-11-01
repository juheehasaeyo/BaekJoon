import java.util.Scanner;
// 5543 상근날드
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        int cola = sc.nextInt();
        int cider = sc.nextInt();

        int burger = Math.min(b1, (Math.min(b2, b3)));
        int drink = Math.min(cola, cider);
        System.out.println(burger + drink - 50);

    }
}