import java.io.IOException;
import java.util.Scanner;
//26040 특정 대문자를 소문자로 바꾸기
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] arr = sc.nextLine().split(" ");

        for (int i=0; i<arr.length; i++) {
            String s = arr[i];
            //문자열 str에서 s를 소문자로 변환
            str = str.replaceAll(s, s.toLowerCase());
        }
        System.out.println(str);
    }
}