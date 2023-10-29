import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
// 2161 카드1
// 큐
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<Integer>();
        int back = 0;

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch (str) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    back = x;
                    q.add(x);
                    break;
                case "pop":
                    if(q.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(q.poll());
                    }
                    break;
                case "size":
                    System.out.println(q.size());
                    break;
                case "empty":
                    if(q.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "front":
                    if(q.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(q.peek());
                    }
                    break;
                case "back":
                    if(q.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(back);
                    }
                    break;
            }
        }
    }
}
/*
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// 2161 카드1
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<Integer>();
        int back = 0;
        for(int i=0; i<n; i++) {
            String str = sc.next();
            switch (str) {
                case "push":
                    int x = sc.nextInt();
                    back = x;
                    q.add(x);
                    break;
                case "pop":
                     if(q.isEmpty()) System.out.println(-1);
                     else System.out.println(q.poll());
                     break;
                case "size":
                    System.out.println(q.size());
                    break;
                case "empty":
                    if(q.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                case "front":
                    if(q.isEmpty()) System.out.println(-1);
                    else System.out.println(q.peek());
                    break;
                case "back":
                    if(q.isEmpty()) System.out.println(-1);
                    else System.out.println(back);
                    break;
            }
        }
    }
}
*/