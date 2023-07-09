import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	
    	int n = s.nextInt(); //바구니의 개수
    	int [] arr = new int[n];
    	for(int i=0; i<arr.length; i++) {
    		//처음 바구니에 i번의 공이 있음
    		arr[i] = (i+1);
    	}
    	int m = s.nextInt(); //바구니 순서 역순 반복 횟수
    	
    	for(int k=0; k<m; k++) {
    		int i = s.nextInt()-1;
    		int j = s.nextInt()-1;
    		//역순으로 바구니 순서 변경
    		while(i < j) {   			
    			int tmp = arr[i];
    			arr[i] = arr[j];
    			arr[j] = tmp;
    			i++;
    			j--;
    		}
    	}
    	for(int i=0; i<arr.length; i++) {
    		System.out.print(arr[i]+" ");
    	}
    }
}