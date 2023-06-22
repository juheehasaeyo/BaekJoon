import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);           	

    	int [] angle = new int[3];
    	for(int i=0; i<3; i++) {
    		angle[i] = s.nextInt();     		    		  
    	}
    	if(angle[0] + angle[1] + angle[2] == 180) {
    		if((angle[0]==angle[1]) && (angle[1]==angle[2])) {
    			System.out.println("Equilateral");
    		}
    		else if(angle[0]==angle[1] || angle[0]==angle[2] || angle[1]==angle[2]) {    			
    			System.out.println("Isosceles");
    		}
    		else {
    			System.out.println("Scalene");
			}    		
    	}
    	else {
    		System.out.println("Error");
		}
   }
}