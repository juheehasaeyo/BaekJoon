import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt(); //개수
        String digit = s.next(); //입력값
        int sum=0;
        
        for(int i=0; i<num; i++) {        
        	sum += digit.charAt(i)-'0';
        }      
         System.out.println(sum);
    }
}