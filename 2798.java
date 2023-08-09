import java.util.Scanner;
// 2798 블랙잭
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] arr = new int[104];
        for(int i=0; i<N; i++) {
		arr[i] = sc.nextInt();
	}
        int result = 0;
        //nC3
        for(int i=0; i<N; i++) { //arr[i]
            for(int j=i+1; j<N; j++) { //arr[j]
                for(int k=j+1; k<N; k++) { //arr[k]
                	
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == M) {
                	result = sum; //결과값 갱신
                        break;
                }
                //합이 목표값보다 작으면서 기존 결과값보다 큰 경우
                else if ((result < sum) && (sum < M)) {
                        result = sum;
                        break;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
