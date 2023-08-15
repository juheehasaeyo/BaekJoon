import java.util.Scanner;
//10824
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.next();	
		String B = sc.next();
		String C = sc.next();
		String D = sc.next();
		
		String AB = A+B;
		String CD = C+D;
		long result = Long.valueOf(AB)+Long.valueOf(CD);
		System.out.println(result);
	}
}