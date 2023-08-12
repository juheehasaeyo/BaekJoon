import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int T = sc.nextInt();
		int [] arr = new int[15];
		arr[0] = 1; //0을 만드는 방법은 아무것도 더하지 않는 1가지 방법!
		arr[1] = 1;
		arr[2] = 2;
		for(int i=3; i<arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
		}
		for(int j=0; j<T; j++) {
			int n = sc.nextInt();
			System.out.println(arr[n]);
		}
	}
}