import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[3];
        for(int i=0; i<3; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        String str = sc.next();

        for(int i=0; i<3; i++) {
            char ch = str.charAt(i);
            if(ch == 'A') {
                System.out.print(arr[0] + " ");
            } else if (ch == 'B') {
                System.out.print(arr[1] + " ");
            } else if (ch == 'C') {
                System.out.print(arr[2] + " ");
            }
        }
    }
}
