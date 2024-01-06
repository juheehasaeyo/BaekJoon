import java.util.Scanner;
// 9366 삼각형 분류
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.print("Case #" + i + ": ");
            if(a+b > c && a+c > b && b+c > a) {
                if (a == b && b == c) {
                    System.out.print("equilateral");
                } else if (a == b || a == c || b == c) {
                    System.out.print("isosceles");
                } else System.out.print("scalene");
                System.out.println();
            } else System.out.println("invalid!");
        }
    }
}