import java.util.Scanner;
// 5522 카드게임
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=0; i<5; i++) {
            int score = sc.nextInt();
            sum += score;
        }
        System.out.println(sum);
    }
}