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
    	int m = s.nextInt(); //m번 반복

    	for(int k=0; k<m; k++) {
    		int i = s.nextInt()-1;
    		int j = s.nextInt()-1;
    		//i와 j 자리 바꿔주기
    		int temp = arr[i];
    		arr[i] = arr[j];
    		arr[j] = temp;
    	}
    	for(int i=0; i<arr.length; i++) {
    		System.out.print(arr[i]+" ");
    	}
    }
}