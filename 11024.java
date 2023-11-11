import java.util.Scanner;
// 11024 더하기 4
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<t; i++) {
            int sum = 0;
            String str = sc.nextLine();
            String[] nums = str.split(" "); //공백 구분

            for(String list: nums) {
                //문자열을 정수로 변환하여 합계 계산
                sum += Integer.parseInt(list);
            }
            System.out.println(sum);
        }
    }
}