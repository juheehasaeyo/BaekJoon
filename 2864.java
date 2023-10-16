import java.util.Scanner;
//2864 5와 6의 차이
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String maxA = "";
        String maxB = "";
        String minA = "";
        String minB = "";

        for(int i=0; i<a.length(); i++) {
            if(a.charAt(i) == '5' || a.charAt(i) == '6'){
                // a에서 5를 6으로 바꾸는 경우
                minA += '5';
                maxA += '6';
            } else { // 5나 6이 아닌 경우는 그대로 사용
                minA += a.charAt(i);
                maxA += a.charAt(i);
            }
        }
        for(int i=0; i<b.length(); i++) {
            if(b.charAt(i) == '5' || b.charAt(i) == '6'){
                minB += '5';
                maxB += '6';
            } else {
                minB += b.charAt(i);
                maxB += b.charAt(i);
            }
        }
        int min = Integer.parseInt(minA) + Integer.parseInt(minB);
        int max = Integer.parseInt(maxA) + Integer.parseInt(maxB);
        System.out.println(min + " " + max);
    }
}
/*
        int a = sc.nextInt();
        int b = sc.nextInt();

        String a_str = String.valueOf(a);
        String b_str = String.valueOf(b);

        int min = Integer.parseInt(a_str.replace("6", "5")) + Integer.parseInt(b_str.replace("6", "5"));
        int max = Integer.parseInt(a_str.replace("5", "6")) + Integer.parseInt(b_str.replace("5", "6"));
        System.out.println(min + " " + max);
 */