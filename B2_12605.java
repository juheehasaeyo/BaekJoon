import java.util.Scanner;
// 12605 단어순서 뒤집기
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // 개행문자 처리
        for(int i=0; i<t; i++) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            System.out.print("Case #" + (i + 1) + ": ");
            for(int j=arr.length-1; j>=0; j--){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}