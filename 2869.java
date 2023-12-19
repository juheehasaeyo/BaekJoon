import java.util.Scanner;
// 2869 달팽이는 올라가고 싶다
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int up = sc.nextInt(); // A
        int down = sc.nextInt(); // B
        int length = sc.nextInt(); // V

        int day = (length - down) / (up - down);

        // 나머지가 있으면-> 잔여 블록이 있는 경우
        if ((length - down) % (up - down) != 0) {
            day++;
        }
        System.out.println(day);
    }
}