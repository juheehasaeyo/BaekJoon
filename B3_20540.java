import java.util.Scanner;
// 20540 연길이의 이상형
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mbti = sc.next();
        String[] arr = new String[mbti.length()];
        for(int i=0; i<mbti.length(); i++) {
            if(mbti.charAt(0) == 'E') {
                arr[0] = String.valueOf('I');
            } else {
                arr[0] = String.valueOf('E');
            }
            if(mbti.charAt(1) == 'S') {
                arr[1] = String.valueOf('N');
            } else {
                arr[1] = String.valueOf('S');
            }
            if(mbti.charAt(2) == 'F') {
                arr[2] = String.valueOf('T');
            } else {
                arr[2] = String.valueOf('F');
            }
            if(mbti.charAt(3) == 'J') {
                arr[3] = String.valueOf('P');
            } else {
                arr[3] = String.valueOf('J');
            }
        }
        System.out.println(arr[0]+arr[1]+arr[2]+arr[3]);
    }
}