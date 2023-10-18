import java.util.Scanner;
//5635 생일
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] age = new int[n+4];
        String [] name = new String[n];

        for(int i=0; i<n; i++) {
            name[i] = sc.next();
            int dd = sc.nextInt();
            int mm = sc.nextInt();
            int yyyy = sc.nextInt();
            age[i] = (yyyy * 365) + (mm * 12) + dd;
        }
        int min = 0, max = 0;
        //i는 1부터 시작, 0번 인덱스와 비교하기 위해!
        for(int i=1; i<n; i++) {
            if(age[i] < age[max]) {
                max = i;
            } else if (age[i] > age[min]) {
                min = i;
            }
        }
        System.out.println(name[min] + "\n" + name[max]);
    }
}