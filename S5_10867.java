import java.util.Arrays;
import java.util.Scanner;
// 10867 중복 빼고 정렬하기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        // 중복 확인하면서 출력
        System.out.print(arr[0] + " ");
        for(int i=1; i<n; i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}