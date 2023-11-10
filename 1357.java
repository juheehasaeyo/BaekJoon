import java.util.Scanner;
// 1357 뒤집힌 덧셈
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        StringBuffer sb = new StringBuffer(x);
        StringBuffer revx = sb.reverse();
        sb = new StringBuffer(y);
        StringBuffer revy = sb.reverse();
        // StringBuffer를 String으로 변환 후 int형으로 변환해서 합계 계산
        int sum = Integer.parseInt(String.valueOf(revx)) + Integer.parseInt(String.valueOf(revy));
        String result = String.valueOf(sum);
        // int로 바꿔서 출력해야 001 이런 식으로 안 나옴!
        sb = new StringBuffer(result);
        StringBuffer answer = sb.reverse();

        int res = Integer.parseInt(String.valueOf(answer));
        System.out.println(res);
    }
}