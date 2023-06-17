import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);   	
    	
    	int [] x = new int[3];
    	int [] y = new int[3];
    	
    	for(int i=0; i<3; i++) {
    		x[i] = s.nextInt();
    		y[i] = s.nextInt();
    	}
    	int Fx, Fy;
    	
    	if(x[0] == x[1]) 
    		Fx=x[2];
    	else if(x[0] == x[2]) 
    		Fx=x[1];
    	else 
    		Fx=x[0];
    	
    	if(y[0] == y[1]) 
    		Fy=y[2];
    	else if(y[0] == y[2]) 
    		Fy=y[1];
    	else 
    		Fy=y[0];  
    	System.out.println(Fx+" "+Fy);
    }
}