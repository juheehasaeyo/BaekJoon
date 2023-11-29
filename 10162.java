import java.util.Scanner;
// 10162 전자레인지
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int a = t/300;
        t = t%300;
        int b = t/60;
        t = t%60;
        int c = t/10;
        t = t%10;

        if(t == 0) {
            System.out.println(a + " " + b + " " + c);
        } else System.out.println("-1");
    }
}