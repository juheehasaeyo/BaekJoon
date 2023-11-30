import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
// 9237 이장님 초대
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        // 묘목 심었으니 1일 + 묘목이 다 자라니까 2일차
        int cnt = 2;
        int res = 0;

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0; i<n; i++) {
            res = Math.max(res, cnt + arr[i]);
            cnt++;
        }
        System.out.println(res);
    }
}