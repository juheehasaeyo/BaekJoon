import java.io.*;
import java.util.*;
// 18258 큐 2
public class Main {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int back = 0;
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch (str) {
                case "push": {
                    int x = Integer.parseInt(st.nextToken());
                    q.add(x);
                    back = x;
                    break;
                }
                case "pop": {
                    if (q.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(q.poll()).append("\n");
                    }
                    break;
                }
                case "size": {
                    sb.append(q.size()).append("\n");
                    break;
                }
                case "empty": {
                    if (q.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                }
                case "front": {
                    if (q.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(q.peek()).append("\n");
                    }
                    break;
                }
                case "back": {
                    if (q.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(back).append("\n");
                    }
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}