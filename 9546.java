import java.util.Scanner;
// 9546 3000번 버스
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int k = sc.nextInt();
            if(k == 1) {
                System.out.println("1");
            } else {
                System.out.println((int)Math.pow(2,k) - 1);
            }
        }
    }
}