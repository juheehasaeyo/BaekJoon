import java.util.Scanner;
// 1912 연속합
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] psum = new int[n+4];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        psum[0] = arr[0];
        for(int i=1; i<n; i++) {
            psum[i] = Math.max(arr[i], psum[i-1] + arr[i]);
            max = Math.max(max, psum[i]);
        }
        System.out.println(max);
    }
}
/*
import java.io.*;
// 1912 연속합
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] psum = new int[n+4];
        String[] input = br.readLine().split(" ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int max = arr[0];
        psum[0] = arr[0];
        for(int i=1; i<n; i++) {
            psum[i] = Math.max(arr[i], psum[i-1] + arr[i]);
            max = Math.max(max, psum[i]);
        }
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}
*/
