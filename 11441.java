import java.util.Scanner;
//11441 합 구하기
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[100004];
        int [] psum = new int[100005];
        psum[0] = 0;
        for(int i=1; i<=n; i++) {
            arr[i] = sc.nextInt();
            psum[i] = psum[i-1] + arr[i];
        }
        int m = sc.nextInt();
        for(int i=0; i<m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(psum[end] - psum[start-1]);
        }
    }
}