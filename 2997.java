import java.util.Arrays;
import java.util.Scanner;
// 2997 네 번째 수
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i=0; i<3; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int m1 = arr[1] - arr[0];
        int m2 = arr[2] - arr[1];

        if(m1 == m2) {
            System.out.println(arr[2] + m1);
        } else if (m1 < m2) {
            System.out.println(arr[1] + m1);
        } else System.out.println(arr[0] + m2);
    }
}