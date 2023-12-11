import java.util.Scanner;
// 22966 가장 쉬운 문제를 찾는 문제
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String easiestTitle = "";
        int min = Integer.MAX_VALUE;
        for(int i=0; i<t; i++) {
            String title = sc.next();
            int level = sc.nextInt();
            if(min > level) {
                min = level;
                easiestTitle = title;
            }
        }
        System.out.println(easiestTitle);
    }
}