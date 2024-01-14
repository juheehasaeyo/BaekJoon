import java.util.Scanner;
// 2491 수열
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cntAsc = 1;
        int cntDesc = 1;
        int max = 1;
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=1; i<n; i++) {
            if(arr[i-1] <= arr[i]) { // 오름차순
                cntAsc++;
                max = Math.max(max, cntAsc);
            } else {
                cntAsc = 1;
            }
        }
        for(int i=1; i<n; i++) { // 내림차순
            if(arr[i-1] >= arr[i]) {
                cntDesc++;
                max = Math.max(max, cntDesc);
            } else {
                cntDesc = 1;
            }
        }
        System.out.println(max);
    }
}