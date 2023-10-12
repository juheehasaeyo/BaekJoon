import java.util.Scanner;
//1912 연속합
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] temp = new int[104];
        //pmax 변수를 가장 작은 정수 값으로 초기화
        int pmax = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            temp[i] = sc.nextInt();
        }
        // n-k+1은 마지막 k일을 고려한 것
        for(int i=0; i<n-k+1; i++) {
            int sum = 0;
            //연속된 k일의 온도합 구하기
            for(int j=0; j<k; j++) {
                sum += temp[i + j];
            }
            if(sum > pmax) {
                pmax = sum;
            }
        }
        System.out.println(pmax);
    }
}