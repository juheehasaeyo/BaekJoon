import java.util.Scanner;
// 5523 경기 결과
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int winA = 0, winB = 0;
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a > b) {
                winA++;
            } else if(a == b) {
                winA = winA;
                winB = winB;
            } else {
                winB++;
            }
        }
        System.out.println(winA + " " + winB);
    }
}