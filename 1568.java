import java.util.Scanner;
//2435
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time = 0;
        int k = 1; //현재 노래하는 수
        while(true) {
            if(n == 0) break;
            if(n < k) {
                k = 1;
            }
            n -= k; //현재 나무에 앉아있는 새의 수(n)에서 k를 뺌
            time++; //시간 1초 증가
            k++; //다음에 노래할 수(k)를 증가
        }
        System.out.println(time);
    }
}