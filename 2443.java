import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i-1; j++) { //공백 찍기
                System.out.print(" ");
            }
            for(int k=0; k<2*n-(2*i-1); k++){ //별 찍기
                System.out.print("*");
            }
            System.out.println();
        }
    }
}