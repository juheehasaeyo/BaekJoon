import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            String[] str= br.readLine().split(" ");
	// 명령의 종류를 정수로 변환
            int type = Integer.parseInt(str[0]);

            switch (type) {
                case 1:
                    int x = Integer.parseIntstr[1]);
                    s.push(x);
                    break;
                case 2:
                    if (s.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(s.pop() + "\n");
                    }
                    break;
                case 3:
                    bw.write(s.size() + "\n");
                    break;
                case 4:
                    bw.write(s.isEmpty() ? "1\n" : "0\n");
                    break;
                case 5:
                    bw.write(s.isEmpty() ? "-1\n" : s.peek() + "\n");
                    break;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}