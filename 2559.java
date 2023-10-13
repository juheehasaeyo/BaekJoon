import java.util.Scanner;
//14912
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int [] arr = new int[100004];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n-d+1; i++) {
            int sum = 0;
            for(int j=0; j<d; j++) {
                sum += arr[i+j];
            }
            if(sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}