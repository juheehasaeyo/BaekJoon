import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in); 
       
       int N = s.nextInt();
       //거듭제곱 구하기 Math.pow()
       int num = (int)Math.pow(2, N) + 1;
       System.out.println(num*num);
    }
}