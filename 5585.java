import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	
    	int money = 1000 - s.nextInt();
    	int [] arr = {500, 100, 50, 10, 5, 1};
    	int count = 0;
    	
    	for(int i=0; i<arr.length; i++) {
    		if(money == 0) {
    			break;
    		} else {
    			count += money / arr[i];
    			money = money % arr[i];
    		}
    	}
        System.out.println(count);
    }
}