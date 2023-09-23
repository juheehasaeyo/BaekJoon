import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] w = new int[10];
        int [] k = new int[10]; 
        int sumw = 0;
        int sumk = 0;
        for(int i=0; i<10; i++) {
            w[i] = sc.nextInt();
        }
        for(int i=0; i<10; i++) {
            k[i] = sc.nextInt();
        }
        Arrays.sort(w);
        Arrays.sort(k);
        sumw = w[9] + w[8] + w[7];
        sumk = k[9] + k[8] + k[7];
        System.out.println(sumw + " " + sumk);
    }
}
