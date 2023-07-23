import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
		int H = s.nextInt();
		int M = s.nextInt();
		int C = s.nextInt();

		//시간을 분으로 변환(H->min)
		int min = H * 60;
		int result = min + M + C;		
		
		System.out.println((result/60)%24 +" "+ result%60);
	}
}