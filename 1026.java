import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
// 1026 보물
// 내림차순 정렬을 하려면 int가 아닌 Integer로 선언 후 Collections.reverseOrder() 사용!
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        Integer [] b = new Integer[n];
        int s = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        // a는 오름차순, b는 내림차순
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());
        for(int i=0; i<n; i++) {
            s += a[i] * b[i];
        }
        System.out.println(s);
    }
}
/*
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(st2.nextToken());
        }
        // Arrays.sort() 메서드로 배열 A, B를 오름차순 정렬하면
        Arrays.sort(a);
        Arrays.sort(b);
        int s = 0;
        // a[0]은 최솟값, b[N-1]은 최댓값이 됨
        for (int i = 0; i < n; i++) {
            s += a[i] * b[n-1-i];
        }
        bw.write(Integer.toString(s));
        bw.flush();
        bw.close();
    }
}
*/