import java.util.Scanner;
// 18406 럭키 스트레이트
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int leftsum = 0, rightsum = 0;
        for(int i=0; i<str.length(); i++) {
            if(i < len/2) {
                leftsum += str.charAt(i);
            } else {
                rightsum += str.charAt(i);
            }
        }
        if(leftsum == rightsum) {
            System.out.println("LUCKY");
        } else System.out.println("READY");
    }
}