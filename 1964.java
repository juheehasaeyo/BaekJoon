import java.util.Scanner;
//등차수열
public class Main {
   
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long a = 5; //1단계 점의 개수 
		long b = 7; // 증가값(공차)
		for(int i=1; i<N; i++) {			
			a += b;
			b += 3;
		}
		System.out.println(a % 45678);
	}
}