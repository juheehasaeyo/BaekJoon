import java.io.*;
import java.util.Scanner;
// 11557 Yangjojang of The Year
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            String[] univ = new String[n];
            int[] alcohol = new int[n];

            for(int j=0; j<n; j++) {
                String[] input = br.readLine().split(" ");
                univ[j] = input[0];
                alcohol[j] = Integer.parseInt(input[1]);
            }
            int maxIndex = 0;

            for (int j=0; j<n; j++) {
                if (alcohol[j] > alcohol[maxIndex]) {
                    maxIndex = j;
                }
            }
            bw.write(univ[maxIndex] + "\n");
        }
        bw.close();
    }
}
/*
import java.util.Scanner;
// 11557 Yangjojang of The Year
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            String[] univ = new String[20];
            int[] alcohol = new int[10000000];

            for(int j=0; j<n; j++) {
                univ[j] = sc.next();
                alcohol[j] = sc.nextInt();
            }
            int maxIndex = 0;
            
            for (int j=0; j<n; j++) {
                if (alcohol[j] > alcohol[maxIndex]) {
                    maxIndex = j;
                }
            }
            System.out.println(univ[maxIndex]);
        }
    }
}
*/