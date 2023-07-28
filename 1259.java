import java.util.Scanner;
//1259 팰린드롬수
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			String str = sc.next();
			boolean bl = true;
			if(str.equals("0")) {
				break;
			}
			int left = 0;
			int right = str.length() - 1;

			for(int i=0; i<str.length()/2; i++) {
				if(str.charAt(left) != str.charAt(right)) {
					bl = false;

				}
				left++;
				right--;
			}
			if(bl == false) {
				System.out.println("no");
			} else {
				System.out.println("yes");
			}
		}		
	}
}