import java.util.Scanner;
//10211 Maximum Subarray
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int [] arr = new int[n];
            int [] psum = new int[n];

            for(int j=0; j<n; j++) {
                arr[j] = sc.nextInt();
            }
            int max = arr[0];
            psum[0] = arr[0];
	//배열의 인덱스가 0부터 n-1까지니까
            for(int j=1; j<n; j++) {
                psum[j] = Math.max(arr[j], psum[j-1] + arr[j]);
                max = Math.max(max, psum[j]);
            }
            System.out.println(max);
        }
    }
}