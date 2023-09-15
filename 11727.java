import java.util.Scanner;
//11727
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long [] arr = new long[1004];
        arr[1] = 1;
        arr[2] = 3;
        arr[3] = 5;
        for(int i=4; i<arr.length; i++){
            arr[i] = (arr[i-1] + 2 * arr[i-2]) % 10007;
        }
        System.out.println(arr[n]);
    }
}