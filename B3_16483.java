import java.util.Scanner;
// 16483 접시 안의 원
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        System.out.println(Math.round(t*t / 4));
    }
}