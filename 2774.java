import java.util.Scanner;
// 2774 아름다운 수
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int cnt = 0;
            int x = sc.nextInt();
            // 입력된 숫자를 문자열로 변환
            String str = String.valueOf(x);
            for(int j=0; j<str.length(); j++) {
                char digit = str.charAt(j);
                // 중복 여부 판단
                boolean bl = true;
                for(int k=0; k<j; k++) {
                    // 중복된 숫자를 찾으면
                    if(str.charAt(k) == digit) {
                        bl = false;
                        break;
                    }
                }
                if(bl) { // 중복이 없다면
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}