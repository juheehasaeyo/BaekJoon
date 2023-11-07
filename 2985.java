import java.util.Scanner;
// 2985 세 수
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a + b == c) {
            System.out.println(a+"+"+b+"="+(a+b));
        } else if (a - b == c) {
            System.out.println(a+"-"+b+"="+(a-b));
        } else if (a / b == c) {
            System.out.println(a+"/"+b+"="+(a/b));
        } else if (a * b == c) {
            System.out.println(a+"*"+b+"="+(a*b));
        } else if (a == b + c) {
            System.out.println(a+"="+b+"+"+c);
        } else if (a == b - c) {
            System.out.println(a+"="+b+"-"+c);
        } else if (a == b / c) {
            System.out.println(a+"="+b+"/"+c);
        } else if (a == b * c) {
            System.out.println(a+"="+b+"*"+c);
        }
    }
}