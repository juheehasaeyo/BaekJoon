import java.util.Arrays;
import java.util.Scanner;
// 11948 과목선택
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[4];
        int[] arr2 = new int[2];
        for(int i=0; i<4; i++) {
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        int res1 = arr1[3] + arr1[2] + arr1[1];
        for(int i=0; i<2; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr2);
        int res2 = arr2[1];
        System.out.println(res1 + res2);
    }
}