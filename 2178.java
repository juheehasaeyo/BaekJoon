import java.util.*;
//2178 미로 탐색(BFS)
public class Main {
    //Pair 만들어주기
    static class Pair {
        int y, x;
        Pair(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
    public static void main(String[] args) {
        //좌표 설정, 지도 및 방문처리 생성
        int[] dy = {1, -1, 0, 0};
        int[] dx = {0, 0, 1, -1};
        int[][] adj= new int[104][104];
        int[][] visited = new int[104][104];
        //큐 선언
        Queue<Pair> q = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //주어진 지도 입력
        for(int i = 1; i <= n; i++) {
            String str = sc.next();
            for(int j = 1; j <= m; j++) {
                adj[i][j] = str.charAt(j - 1) - '0';
            }
        }
        //시작 위치 방문처리 하기
        visited[1][1] = 1;
        q.add(new Pair(1, 1));

        while (!q.isEmpty()) { //문자열이 빈 값이면 true
            Pair pi = q.poll();
            int y = pi.y;
            int x = pi.x;

            for(int i=0; i<4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (ny < 1 || ny > n || nx < 1 || nx > m) continue;
                if (adj[ny][nx] == 0) continue;
                if (visited[ny][nx] >= 1) continue;
                //bfs 하기
                visited[ny][nx] = visited[y][x] + 1;
                q.add(new Pair(ny, nx));
            }
        }
        System.out.println(visited[n][m]);
    }
}