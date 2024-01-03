import java.util.Scanner;
// 14912 숫자 빈도수
// charAt()은 String으로 저장된 문자열 중 한 글자를 선택해서 char타입으로 변환해줌
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int cnt = 0;
        for(int i=1; i<=n; i++) {
            String str = Integer.toString(i);
            // 문자열의 각 자리에 대해 반복
            for(int j=0; j<str.length(); j++) {
                // 현재 자리의 숫자와 입력받은 숫자 d 비교
                // '0'을 빼주어서 char를 int형으로 변환
                if(str.charAt(j) - '0' == d) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}