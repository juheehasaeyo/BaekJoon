import java.util.Scanner;
// 23037 5의 수난
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int res = 0;
        for(int i=0; i<n.length(); i++) {
            // 주어진 문자의 숫자값을 반환
            int digit = Character.getNumericValue(n.charAt(i));
            res += (int) Math.pow(digit, 5);
        }
        System.out.println(res);
    }
}