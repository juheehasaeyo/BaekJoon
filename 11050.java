import java.util.Scanner;
//11050 이항계수
//nCk = n!/(k!(n-k)!)
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int [] fac = new int[N+1];

		fac[0] = 1;
		for(int i=1; i<=N; i++) {
			fac[i] = i*fac[i-1];
		}
		System.out.println(fac[N]/(fac[K]*fac[N-K]));
	}
}