import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//18110 solved.ac
//Math.ceil()은 올림, Math.round()는 반올림함수
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int num = (int)Math.round(n * 0.15);
        // 나눗셈 연산에서 정수형으로 나누는 경우, 0으로 나눌 때 예외가 발생하므로 double형으로 선언(/by zero 오류)
        double sum = 0;
        for(int i=num; i<n-num; i++) {
            sum += arr[i];
        }
        int avg = (int)Math.round(sum / (n - num * 2));
        System.out.println(avg);
    }
}
