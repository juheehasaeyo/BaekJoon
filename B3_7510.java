import java.util.Arrays;
import java.util.Scanner;
// 7510 고급 수학
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[3];
        for(int i=0; i<t; i++) {
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();
            Arrays.sort(arr);
            System.out.println("Scenario #" + (i+1) + ":");
            if(arr[0]*arr[0] + arr[1]*arr[1] == arr[2]*arr[2]) {
                System.out.println("yes");
            } else System.out.println("no");
            System.out.println();
        }
    }
}