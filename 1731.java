import java.util.Scanner;
// 1731 추론
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int res1 = 0, res2 = 0;
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        if(arr[2] - arr[1] == arr[1] - arr[0]) {
            res1 = arr[1] - arr[0];
            System.out.println(arr[n-1] + res1);
        } else if (arr[2] / arr[1] == arr[1] / arr[0]) {
            res2 = arr[1] / arr[0];
            System.out.println(arr[n-1] * res2);
        }
    }
}