import java.util.Scanner;
// 5063 TGN
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int r = sc.nextInt();
            int e = sc.nextInt();
            int c = sc.nextInt();
            if(r + c < e) {
                System.out.println("advertise");
            } else if (r + c == e) {
                System.out.println("does not matter");
            } else System.out.println("do not advertise");
        }
    }
}