import java.io.*;
import java.util.Arrays;
//14729 칠무해
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        double [] score = new double[n];

        for(int i=0; i<n; i++) {
            score[i] = Double.parseDouble(br.readLine());
        }
        Arrays.sort(score);
        for(int i=0; i<7; i++) {
            bw.write(String.format("%.3f\n", score[i]));
        }
        bw.flush();
    }
}