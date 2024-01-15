import java.util.Arrays;
import java.util.Scanner;
// 9723 Right Triangle
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int[] arr = new int[3];
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();
            Arrays.sort(arr);
            System.out.print("Case #" + (i+1) + ": ");
            if(arr[0]*arr[0] + arr[1]*arr[1] == arr[2]*arr[2]) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }
}