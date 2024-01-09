import java.util.Scanner;
// 8723 Patyki
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a == b && b == c) {
            System.out.println("2");
        } else if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
            System.out.println("1");
        } else System.out.println("0");
    }
}