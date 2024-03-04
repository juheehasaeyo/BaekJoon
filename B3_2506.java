import java.util.Scanner;
// 2506 점수계산
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int score = 0;
        int cnt = 0;
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 1) {
                cnt++;
                score += cnt;
            } else {
                cnt = 0;
            }
        }
        System.out.println(score);
    }
}