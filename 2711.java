import java.util.Scanner;
//2711
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            String str = sc.next();
            StringBuilder sb = new StringBuilder(str);
            sb.deleteCharAt(n-1);
            System.out.println(sb);
        }
    }
}