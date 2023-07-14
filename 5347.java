import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
		int n = s.nextInt();
		for(int i=0; i<n; i++) {
			long a = s.nextLong();
			long b = s.nextLong();
		
		long result1 = gcd(a,b); //최대공약수
    	System.out.println(a*b / result1); //최소공배수
		}
	}
	public static long gcd(long a, long b) {
		while(b != 0) {
			long r = a % b; //나머지 계산

			a = b;
			b = r;
		}
		return a;
	}
}