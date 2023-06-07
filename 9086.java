import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
         
        for(int i=0; i<n; i++) {
        	String input = s.next(); 
        	System.out.print(input.charAt(0));
            System.out.println(input.charAt(input.length()-1)); //Wow!
        }
    } 
}