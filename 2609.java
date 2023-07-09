import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	
    	int a = s.nextInt();
    	int b = s.nextInt();
    	
    	int result1 = gcd(a,b); //최대공약수
    	System.out.println(result1);
    	System.out.println(a*b / result1); //최소공배수
    }

	public static int gcd(int a, int b) {
		while(b != 0) {
			//a>=b
			int r = a % b; //나머지 계산
		
			//gcd(a,b) = gcd(b,r)
			a = b;
			b = r;
		}
		return a;
	}
}