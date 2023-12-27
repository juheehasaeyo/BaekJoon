import java.util.Scanner;
// 3062 수 뒤집기
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            String n = sc.next();
            String reverseN = "";
            boolean bl = true;
            for(int j=n.length()-1; j>=0; j--){
                reverseN = reverseN + n.charAt(j);
            }
            int sum = Integer.parseInt(n)+ Integer.parseInt(reverseN);
            String summ = Integer.toString(sum); // 문자열로 다시 변환
            for(int j=0; j<summ.length()/2; j++) {
                int start = j;
                int end = summ.length()-j-1;
                // 대칭 검사
                if(summ.charAt(start) != summ.charAt(end)) {
                    bl = false;
                    break;
                }
            }
            if(bl == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}