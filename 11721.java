import java.util.Scanner;
//11721 열 개씩 끊어 출력하기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        for(int i=0; i<n.length(); i++) {
            // 해당 index 위치의 문자를 char형으로 반환
            System.out.print(n.charAt(i));
            if(i%10 == 9) { //10의 배수가 될 때 개행
                System.out.println();
            }
        }
    }
}