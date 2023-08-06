import java.util.Scanner;

public class Main {
   
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		for(int j=0; j<3; j++) {
			int [] arr = new int[4];
			int d = 0, b = 0;
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = sc.nextInt();
				if(arr[i] == 1) {
					d++;
				} else if(arr[i] == 0) {
					b++;
				}
			}
			if(d==3 && b==1) {
				System.out.println("A");
			} else if (d==2 && b==2) {
				System.out.println("B");
			} else if (d==1 && b==3) {
				System.out.println("C");
			} else if (d==0 && b==4) {
				System.out.println("D");
			} else if (d==4 && b==0) {
				System.out.println("E");
			}
		}
   }
}