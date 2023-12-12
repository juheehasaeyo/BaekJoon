import java.util.Scanner;
// 10214 Baseball
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int ysum = 0;
            int ksum = 0;
            for(int j=0; j<9; j++) {
                int y = sc.nextInt();
                int k = sc.nextInt();
                ysum += y;
                ksum += k;
            }
            if(ysum > ksum) {
                System.out.println("Yonsei");
            } else if(ysum == ksum) {
                System.out.println("Draw");
            } else System.out.println("Korea");
        }
    }
}