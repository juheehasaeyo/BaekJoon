import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	
    	int [] minguk = new int[4];
    	int [] mansae = new int[4];
    	int S = 0, T = 0;
    	 
    	for(int i=0; i<4; i++) {
    		minguk[i] = s.nextInt();
    		S += minguk[i];
    	}
    	for(int i=0; i<4; i++) {
    		mansae[i] = s.nextInt();
    		T += mansae[i];
    	}
    	if(S > T || S == T) {
    		System.out.println(S);
    	} else {
			System.out.println(T);
		}
    }
}