import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] arr = new int[104];
		int result = 0;
		arr[3] = 0;
		for(int i=4; i<=n; i++) {
			result = n*(n-1)*(n-2)*(n-3) / 24;
		}
		System.out.println(result);
	}
}
