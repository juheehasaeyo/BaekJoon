import java.util.Scanner;
// 10102 개표
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        String str = sc.next();
        int a = 0, b = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'A') {
                a++;
            } else if (str.charAt(i) == 'B') {
                b++;
            }
        }
        if(a > b) {
            System.out.println("A");
        } else if(a == b) {
            System.out.println("Tie");
        } else System.out.println("B");
    }
}