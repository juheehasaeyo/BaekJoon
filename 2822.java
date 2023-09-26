import java.util.Arrays;
import java.util.Scanner;
//점수 계산
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] scores = new int[8];
        int [] arr = new int[8];
        int sum = 0;

        for(int i=0; i<8; i++) {
            scores[i] = sc.nextInt();
            arr[i] = scores[i];
        }
        // scores 배열을 오름차순으로 정렬하여 가장 높은 점수를 찾음
        Arrays.sort(arr);
        for(int i = 3; i < 8; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        // 최종 점수에 포함된 문제 번호를 수집
        int[] scorenum = new int[5];
        int count = 0;
        for(int i=7; i>=3; i--) {
            for(int j=0; j<8; j++) {
                if(scores[j] == arr[i]) {
                    scorenum[count++] = j + 1;
                }
            }
        }
        // 문제 번호를 오름차순으로 정렬하여 출력
        Arrays.sort(scorenum);
        for(int i=0; i<5; i++) {
            System.out.print(scorenum[i] + " ");
        }
    }
}