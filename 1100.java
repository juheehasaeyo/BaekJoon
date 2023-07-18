import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
               
        int count = 0;
        //(i,j)칸일 때, i+j가 짝수이면 흰색 칸
        for (int i=0; i<8; i++) {
            String str = s.nextLine();
            for (int j=0; j<8; j++) {
                if (str.charAt(j) == 'F' && (i+j)%2 == 0) {
                	count++;
                }
            }
        }
        System.out.print(count);
    }
}