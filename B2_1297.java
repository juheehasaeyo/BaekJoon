import java.util.Scanner;
// 1297 TV 크기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt(); // 대각선 길이
        int h = sc.nextInt(); // 높이 비율
        int w = sc.nextInt(); // 너비 비율
        // ration^2 * (h^2 + w^2) = d^2 
        double ratio = Math.pow(d,2) / (Math.pow(h,2) + Math.pow(w,2));
        double res = Math.sqrt(ratio);
        h = (int) (h*res);
        w = (int) (w*res);
        System.out.println(h + " " + w);
    }
}