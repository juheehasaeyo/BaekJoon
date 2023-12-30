import java.util.Scanner;
// 9235 주사위
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sum = 0;
        for(int i=0; i<t; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            sum = n1 + n2;
            System.out.println("Case " + (i+1) + ": " + sum);
        }
    }
}