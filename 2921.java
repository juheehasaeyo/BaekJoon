import java.util.Scanner;
//2921 도미노
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n*(n+1)*(n+2)/2);
    }
}