import java.util.Scanner;
//4504
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while(true) {
        	int k = sc.nextInt();
        	if(k == 0) {
        		break;
        	} else if (k % n == 0) {
				System.out.println(k +" is a multiple of " + n + ".");
			} else {
				System.out.println(k +" is NOT a multiple of " + n + ".");
			}
        }
    }
}