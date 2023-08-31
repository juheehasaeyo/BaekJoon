import java.util.Scanner;
//13699 점화식
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] t = new long[40];
        t[0] = 1;
        t[1] = 1;
        t[2] = 2;
        for(int i=3; i<=35; i++) {
        	for(int j=0; j<i; j++) {
        		t[i] += t[j] * t[i-j-1];
        	}
        }
        System.out.println(t[n]);
    }
}