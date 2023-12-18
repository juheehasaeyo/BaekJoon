import java.util.Scanner;
// 1789 수들의 합
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        long n = 0;

        if(s==1 || s==2) {
            System.out.println(1);
            return;
        }
        for(long i=0; i<s; i++) {
            n += i;
            if(s < n) {
                System.out.println(i-1);
                break;
            } else if(s == n) {
                System.out.println(i);
                break;
            }
        }
    }
}