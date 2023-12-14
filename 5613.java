import java.util.Scanner;
// 5613 계산기 프로그램
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int res = sc.nextInt(); // 초기값 설정
        sc.nextLine(); // 엔터 키 소비

        while(true) {
            String str = sc.nextLine();
            if(str.equals("=")) {
                break;
            }
            int num = sc.nextInt();
            sc.nextLine(); // 엔터 키 소비
            switch (str) {
                case "+":
                    res += num;
                    break;
                case "-":
                    res -= num;
                    break;
                case "*":
                    res *= num;
                    break;
                case "/":
                    res /= num;
                    break;
            }
        }
        System.out.println(res);
    }
}