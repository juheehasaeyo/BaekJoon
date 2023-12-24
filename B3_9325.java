import java.util.Scanner;
// 9325 얼마?
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스 개수
        for(int i=0; i<t; i++) {
            int s = sc.nextInt(); // 자동차의 가격
            int n = sc.nextInt(); // 옵션의 개수
            int res = 0;
            res += s;
            for (int j = 0; j < n; j++) {
                int q = sc.nextInt(); // 특정 옵션의 개수
                int p = sc.nextInt(); // 특정 옵션의 가격
                int price = q * p;
                res += price;
            }
            System.out.println(res);
        }
    }
}