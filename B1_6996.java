import java.util.Arrays;
import java.util.Scanner;
// 6996 애너그램
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String a = sc.next();
            String b = sc.next();
            // 문자열 a와 b를 각각 문자 배열로 변환하는 코드
            char[] arrA = a.toCharArray();
            char[] arrB = b.toCharArray();
            Arrays.sort(arrA);
            Arrays.sort(arrB);
            System.out.print(a +" & " + b + " are ");
            if (!(a.length() == b.length()) || !Arrays.equals(arrA, arrB)) {
                System.out.print("NOT ");
            }
            System.out.print("anagrams.");
            System.out.println();
        }
    }
}