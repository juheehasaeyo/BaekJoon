import java.util.Scanner;
//2789
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            //문자 c를 문자열로 반환
            if(!"ABCDEGIRM".contains(String.valueOf(c))) {
                result += c;
            }
        }
        System.out.println(result);
    }
}