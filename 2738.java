import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in); 
       	
       int N = s.nextInt();
       int M = s.nextInt();
       int[][] A = new int[N][M];
       int[][] B = new int[N][M];
       int[][] result = new int[N][M];
       
       for(int i=0; i<A.length; i++) { //행의 길이
    	   for(int j=0; j<A[i].length; j++) { //열의 길이
    		   A[i][j] = s.nextInt();
    	   }      		   
       }
       for(int i=0; i<B.length; i++) {
    	   for(int j=0; j<B[i].length; j++) {
    		   B[i][j] = s.nextInt();
    	   }      		   
       }
       for(int i=0; i<N; i++) {
    	   for(int j=0; j<M; j++) {
    		   result[i][j] = A[i][j] + B[i][j];
    		   System.out.print(result[i][j]+" ");
    	   }       
    	   System.out.println();
       }
	}
}