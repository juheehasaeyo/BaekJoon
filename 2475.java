import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
       int a = s.nextInt();
       int b = s.nextInt();
       int c = s.nextInt();
       int d = s.nextInt();
       int e = s.nextInt();
       
       System.out.println((a*a+b*b+c*c+d*d+e*e)%10);
	}
}