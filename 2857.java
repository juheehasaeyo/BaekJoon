import java.util.Scanner;
//2857
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String [] fbi = new String[5];
        for(int i=0; i<5; i++) {
            fbi[i] = sc.nextLine();
        }
        boolean bl = false;
        for(int i=0; i<5; i++) {
            if(fbi[i].contains("FBI")) {
                System.out.print((i+1) + " ");
                bl = true;
            }
        }
        if(!bl) {
            System.out.println("HE GOT AWAY!");
        }
    }
}