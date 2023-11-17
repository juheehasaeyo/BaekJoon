import java.util.Scanner;
// 11047 동전 0
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        // 배열 a는 서로 배수 관계에 있다
        int[] a = new int[n];
        int cnt = 0;
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        // 가장 큰 동전부터 탐색
        for(int i=n-1; i>=0; i--) {
            // 현재 동전이 남은 금액보다 작거나 같으면
            if(k >= a[i]) {
                cnt += k/a[i];
                k = k % a[i];
            }
        }
        System.out.println(cnt);
    }
}