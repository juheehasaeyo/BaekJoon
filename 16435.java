import java.util.Arrays;
import java.util.Scanner;
//16435 스네이크버드
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        //배열 크기를 입력받은 과일의 갯수에 맞게 설정해야!
        int [] h = new int[n];
        for(int i=0; i<n; i++) {
            h[i] = sc.nextInt();
        }
        Arrays.sort(h);
        for(int i=0; i<n; i++){
            if(h[i] <= l) {
                l += 1;
            }
        }
        System.out.println(l);
    }
}