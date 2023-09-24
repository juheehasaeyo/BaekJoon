import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            double price = sc.nextDouble();
            double result = price * 0.8;
            System.out.printf("$%.2f\n" , result);
        }
    }
}