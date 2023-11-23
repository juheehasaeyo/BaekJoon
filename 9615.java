import java.util.Scanner;
// 9625 BABBA
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = 0, b = 1;
        int[] arr = new int[k];
        // a는 이전 b의 개수를 따라가고
        // b는 이전 a+b의 개수를 따라간다
        for(int i=1; i<k; i++) {
            int tmp = a + b;
            a = b;
            b = tmp;
        }
        System.out.println(a + " " + b);
    }
}