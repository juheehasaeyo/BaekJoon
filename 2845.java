import java.util.Scanner;
// 2845
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int l = sc.nextInt();
        int p = sc.nextInt();
        for(int i=0; i<5; i++) {
            int num = sc.nextInt();
            System.out.print(num - (l*p) + " ");
        }
    }
}