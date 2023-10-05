import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for(int i=0; i<k; i++) {
            int n = sc.nextInt();
            int [] score = new int[n];
            for(int j=0; j<n; j++) {
                score[j] = sc.nextInt();
            }
            Arrays.sort(score);
            int max = score[n-1];
            int min = score[0];
            int sub = Integer.MIN_VALUE;
            // 가장 큰 인접한 점수 차이
            for(int r=0; r<n-1; r++) {
                sub = Math.max(sub, score[r+1] - score[r]);
            }
            System.out.println("Class " + (i+1));
            System.out.println("Max " + max + ", " + "Min " + min + ", " + "Largest gap " + sub);
        }
    }
}