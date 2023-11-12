import java.io.*;
import java.util.Arrays;
// 15688 수 정렬하기 5
// BufferedReader, BufferedWriter, StringBuilder 사용해야!

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int [] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        // StringBuilder를 사용하여 출력 문자열 누적
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            sb.append(arr[i]).append("\n");
        }
        // 누적된 문자열을 출력
        System.out.print(sb.toString());
    }
}