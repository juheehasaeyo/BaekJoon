import java.util.Scanner;
// 10984 내 학점을 구해줘
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // t개 학기
        for(int i=0; i<t; i++) {
            int n = sc.nextInt(); // 과목 수
            int sum = 0;
            double sum2 = 0, avg = 0;
            for(int j=0; j<n; j++) {
                int c = sc.nextInt(); // 학점
                double g = sc.nextDouble(); // 성적
                sum += c; // 총 학점
                sum2 += c * g;
                avg = sum2 / sum; // 평점
            }
            System.out.println(sum + " " + String.format("%.1f", avg));
        }
    }
}