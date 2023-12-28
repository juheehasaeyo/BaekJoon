import java.util.Scanner;
// 9093 단어 뒤집기
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // 개행문자 처리
        sc.nextLine();
        for(int i=0; i<t; i++) {
            String str = sc.nextLine();
            // 공백을 기준으로 문자열을 분리하여 배열에 저장
            String[] res = str.split(" ");

            for(String result : res) {
                String reverseStr = "";
                // 단어의 각 문자를 역순으로 reverseStr에 추가
                for(int j=result.length()-1; j>=0; j--){
                    reverseStr = reverseStr + result.charAt(j);
                }
                System.out.print(reverseStr + " ");
            }
            System.out.println();
        }
    }
}