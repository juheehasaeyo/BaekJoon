import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
		int H = s.nextInt();
		int M = s.nextInt();
		
		if(M < 45) {
			H--; //시(Hour) 1 감소
			M = 60 - (45-M); //분(Minute) 감소
			if(H < 0) {
				H = 23;
			}
			System.out.println(H +" "+ M);
		} else {
			System.out.println(H +" "+ (M-45));
		}
	}
}