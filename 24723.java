import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);          
       int N = s.nextInt();
       int result=(int) Math.pow(2, N);
       
       System.out.println(result);      
    }
}
