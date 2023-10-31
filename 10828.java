import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
// 10828 스택
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();
        int back = 0;

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch (str) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    back = x;
                    s.add(x);
                    break;
                case "pop":
                    if(s.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(s.pop());
                    }
                    break;
                case "size":
                    System.out.println(s.size());
                    break;
                case "empty":
                    if(s.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "top":
                    if(s.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(s.peek());
                    }
                    break;
            }
        }
    }
}