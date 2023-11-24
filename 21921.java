import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
// 21921 블로그
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 1];
        int max = Integer.MIN_VALUE;
        int cnt = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        
        for (int i = 1; i <= x; i++) {
            sum += arr[i];
        }
        // 초기값 설정
        max = sum;
        cnt = 1;
        
        for (int i = x + 1; i <= n; i++) {
            sum = sum - arr[i - x] + arr[i];

            if (sum > max) {
                max = sum;
                cnt = 1;
            } else if (sum == max) {
                cnt++;
            }
        }
        if (max == 0) {
            bw.write("SAD");
        } else {
            bw.write(max + "\n" + cnt);
        }
        bw.flush();
        bw.close();
    }
}
/*
import java.util.Scanner;
//21921 블로그
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int [] arr = new int[n+1];
        int sum = 0;
        for(int i=1; i<=n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<x; i++) {
            sum += arr[i];
        }
        int max = sum;
        int cnt = 1; // 블로그 시작 1일차부터=> cnt는 1부터 시작

        // x일부터 n일까지의 구간 순회하며 max값 찾아야!
        for(int i=x; i<=n; i++) {
            //x일 간의 방문자 수 합
            sum += arr[i] - arr[i - x];
            if(sum > max) {
                max = sum;
                // 이 합이 현재까지의 최대합이므로 이 합을 가지는 구간은 1개=> 1로 초기화
                cnt = 1;
            } else if (sum == max) {
                cnt++;
            }
        }
        if(max == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(max + "\n" + cnt);
        }
    }
}
*/