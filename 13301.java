import java.util.Scanner;
//13301
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long [] arr = new long[84];
        int n = sc.nextInt();
        arr[0] = 4;
        arr[1] = 6;
        for(int i=2; i<=n; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }
        System.out.println(arr[n-1]);
    }
}