import java.util.Arrays;
import java.util.Scanner;
//2309
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[9];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		//9C2
		boolean bl = false;
		for(int i=0; i<arr.length; i++) {
			if(bl == true) {
				break;
			}
           		for(int j=i+1; j<arr.length; j++) {
            			if(sum - arr[i] - arr[j] == 100) {
            				arr[i] = 0;
            				arr[j] = 0;
            				//0이면 true
            				bl = true;
                    			break;          		
            			}
            		}
	}
		Arrays.sort(arr);
        		for(int i=0; i<9; i++) {
        			if(arr[i] != 0) {
        				System.out.println(arr[i]);
        			}
        		}
	}
}