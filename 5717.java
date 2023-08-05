import java.util.Scanner;

public class Main {
   
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			if(M==0 && N==0) {
				break;
			}
			System.out.println(M+N);
		}
   }
}