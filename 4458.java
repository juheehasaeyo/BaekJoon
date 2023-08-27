import java.util.Scanner;
//4458
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); //Enter!
        for(int i=0; i<n; i++) {
        	String str = sc.nextLine();
        	//str.substring(시작 인덱스, 종료인덱스);
        	//str 문자열에서 첫 번째 문자를 제외한 나머지 부분을 추출
        	System.out.println((str.charAt(0)+"").toUpperCase() + str.substring(1, str.length()));
        }
    }
}