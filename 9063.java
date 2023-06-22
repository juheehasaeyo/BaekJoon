import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);           	

    	int n = s.nextInt();
    	int [] x = new int[n];
    	int [] y = new int[n];
    	
    	for(int i=0; i<n; i++) {
    		x[i] = s.nextInt();
    		y[i] = s.nextInt();
    	}
    	int maxx = x[0];
    	int maxy = y[0];
    	int minx = x[0];
    	int miny = y[0];
    	
    	for(int j=0; j<n; j++) {
    		if(x[j] > maxx) {
    			maxx = x[j];
    		} else if(x[j] < minx) {
    			minx = x[j];
			}   		
    		if(y[j] > maxy) {
    			maxy = y[j];
    		} else if(y[j] < miny) {
    			miny = y[j];
			}   		
    	}    	
    	System.out.println((maxx-minx)*(maxy-miny));    	
   }
}