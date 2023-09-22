import java.util.Scanner;
//1309
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int [] zoo = new int[n+4];
        zoo[0] = 1;
        zoo[1] = 3;
        for(int i=2; i<=n; i++) {
            zoo[i] = (2*zoo[i-1] + zoo[i-2]) % 9901;
        }
        System.out.println(zoo[n]);
    }
}