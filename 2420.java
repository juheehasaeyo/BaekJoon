import java.util.Scanner;

public class Main {
    public static void main(String[] args) {   	
    	Scanner s = new Scanner(System.in);
    	
    	long N = s.nextLong();
       	long M = s.nextLong();
       	
       	System.out.println(N-M > M-N ? N-M : M-N);
    }
}