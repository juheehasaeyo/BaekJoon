import java.util.Scanner;
// 7600 문자가 몇갤까
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            if(str.equals("#")) {
                break;
            }
            int[] arr = new int[26];
            str = str.toLowerCase();
            for(int i=0; i<str.length(); i++) {
                char ch = str.charAt(i);
                // ch가 문자인지 확인
                if(Character.isLetter(ch)) {
                    int index = ch - 'a';
                    arr[index]++;
                }
            }
            int cnt = 0;
            for(int i=0; i<26; i++) {
                if(arr[i] > 0) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}