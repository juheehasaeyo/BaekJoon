import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i=0; i<str.length(); i++) {
            //대문자만 출력
            if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
                System.out.print(str.charAt(i));
            }
        }
    }
}