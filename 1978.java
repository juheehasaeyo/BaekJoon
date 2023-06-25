import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in); 
       		
		int N = s.nextInt();		
		int count = 0;
		
		for(int i = 0; i < N; i++) {			
			//소수이면 true, 아닌경우 false   
			boolean sosu = true;			
			int num = s.nextInt();		
			
			if(num == 1) {
				continue;
			}
			for(int j=2; j<num; j++) {
				if(num%j == 0)
					sosu = false;
			}
			if(sosu) {
				count++;
			}
		}
		System.out.println(count);
	}
}