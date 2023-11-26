import java.util.Scanner;
// 13420 사칙연산
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            long a = sc.nextLong();
            String str1 = sc.next();
            long b = sc.nextLong();
            String str2 = sc.next();
            long res1 = sc.nextLong();

            long res2 = 0;
            if(str1.equals("*")) {
                res2 = a * b;
            } else if (str1.equals("+")) {
                res2 = a + b;
            } else if (str1.equals("-")) {
                res2 = a - b;
            } else if (str1.equals("/")) {
                res2 = a / b;
            }
            if(res1 == res2) {
                System.out.println("correct");
            } else System.out.println("wrong answer");
        }
    }
}