import java.util.Scanner;

public class Main {
	   public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      
	      int second = sc.nextInt();
	      int third = sc.nextInt();
	      int age = third - second;
	      
	      System.out.println(age + third);
	   }
}