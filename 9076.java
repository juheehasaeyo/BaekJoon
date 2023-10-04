import java.util.Arrays;
import java.util.Scanner;
//9076 점수 집계
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int [] n = new int[5];
            for(int j=0; j<5; j++) {
                n[j] = sc.nextInt();
            }
            Arrays.sort(n);
            int sum = n[1]+n[2]+n[3];
            if (n[3] - n[1] >= 4) System.out.println("KIN");
            else System.out.println(sum);
        }
    }
}