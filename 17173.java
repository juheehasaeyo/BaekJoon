import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	
    	int N = s.nextInt();
    	int M = s.nextInt();
    	int [] arr = new int[M];
    	int sum = 0;    	
    	for(int i=0; i<arr.length; i++) {
    		arr[i] = s.nextInt();
    	}
    	Arrays.sort(arr);
    	
    	for(int i=1; i<=N; i++) {
    		for(int j=0; j<M; j++) {
			//i가 arr[j]의 배수라면 sum에 i 더하기
    			if(i % arr[j] == 0) {
    				sum += i;
    				break;
    			}
    		}
	}
    	System.out.println(sum);
    }
}