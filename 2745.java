import java.util.Scanner;
// 2745 진법 변환
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String n = sc.next();
        int b = sc.nextInt();
        System.out.println(Integer.parseInt(n,b));
    }
}