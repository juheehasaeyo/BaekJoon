import java.util.Scanner;

public class Main{
	public static void main(String[] args){
       Scanner s = new Scanner(System.in);
      
       int T = s.nextInt();
       for(int i=0; i<T; i++) {
    	   int A = s.nextInt();
    	   int B = s.nextInt();
       
       int result1 = gcd(A,B); //최대공약수
       System.out.println(A*B / result1); //최소공배수
       }
}
	public static int gcd(int A, int B) {
		// TODO Auto-generated method stub
		while(B != 0) {
   			//A>=B
   			int r = A % B; //나머지 계산
   		
   			//gcd(A,B) = gcd(B,r)
   			A = B;
   			B = r;
   		}
   		return A;
	}
}
