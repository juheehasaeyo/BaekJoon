import java.util.Scanner;
// 1264 모음의 개수
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String str = sc.nextLine();
            if(str.equals("#")) {
                break;
            }
            int cnt = 0;
            str = str.toLowerCase();
            for(int i=0; i<str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u') {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}