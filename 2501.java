import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int K = s.nextInt();
        int [] arr = new int[N+1];
        int count = 0; //N의 약수의 개수
        
        for(int i=1; i<=N; i++) {
        	if(N % i == 0) {
        		//약수이면 arr배열의 count인덱스에 i를 저장
        		arr[count] = i;
        		count++;
        	}
        }
		System.out.println(arr[K-1]);
    }
}