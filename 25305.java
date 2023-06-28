import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    	
       Scanner s = new Scanner(System.in);

       int N = s.nextInt();
       int k = s.nextInt();
       Integer [] x = new Integer[N];
       for(int i=0; i<x.length; i++) {
    	   x[i] = s.nextInt();
       }
       Arrays.sort(x, Collections.reverseOrder());
       
       System.out.println(x[k-1]);
    }
}