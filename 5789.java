import java.util.Scanner;
//5789
public class Main {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			String str = sc.next();
			char start = str.charAt(str.length()/2);
			char end = str.charAt(str.length()/2 - 1);
			
			if(start == end) {
				System.out.println("Do-it");
			} else {
				System.out.println("Do-it-Not");
			}
		}
	}	
}