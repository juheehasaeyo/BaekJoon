import java.util.Scanner;
// 10822 더하기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(",");
        int sum = 0;
        for(String res : arr) {
            sum += Integer.parseInt(res);
        }
        System.out.println(sum);
    }
}