import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int cup = 1; // 컵 번호
		for(int i=0; i<M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			// 1번과 바뀌는 번호가 공의 위치
			if(cup == x) {
				cup = y;
			} else if (cup == y) {
				cup = x;
			}
		}
		System.out.println(cup);
	}
}