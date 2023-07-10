import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	
    	int [] score = new int[5];
    	int avg = 0, sum = 0;
    	
    	for(int i=0; i<5; i++) {
    		score[i] = s.nextInt();
    		if(score[i] < 40) {
    			score[i] = 40;
    		}
    		sum += score[i];
    		avg = sum/5;
    	}
    	System.out.println(avg);
    }
}