import java.io.*;
// 14623 감정이입
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String b1 = br.readLine();
        String b2 = br.readLine();
        long str1 = Long.parseLong(b1, 2);
        long str2 = Long.parseLong(b2, 2);
        long res = str1 * str2;
        String result = Long.toBinaryString(res);
        bw.write(result);
        bw.close();
    }
}
/*
import java.util.Scanner;
// 14623 감정이입
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b1 = sc.next();
        String b2 = sc.next();
        long str1 = Integer.parseInt(b1, 2);
        long str2 = Integer.parseInt(b2, 2);
        long res = str1 * str2;
        String result = Long.toBinaryString(res);
        System.out.println(result);
    }
}
*/