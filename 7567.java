import java.util.Scanner;
// 7567 그릇
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = 10;

        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)) {
                num += 5;
            } else {
                num += 10;
            }
        }
        System.out.println(num);
    }
}