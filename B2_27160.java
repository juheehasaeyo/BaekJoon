import java.util.Scanner;
// 27160 할리갈리
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sumStr = 0; int sumBa = 0; int sumLi = 0; int sumPl = 0;
        String res1 = ""; String res2 = ""; String res3 = ""; String res4 = "";
        for(int i=0; i<t; i++) {
            String fruit = sc.next();
            int x = sc.nextInt();
            switch (fruit) {
                case "STRAWBERRY":
                    sumStr += x;
                    if(sumStr == 5) {
                        res1 = "YES";
                        break;
                    } else res1 = "NO"; break;
                case "BANANA":
                    sumBa += x;
                    if(sumBa == 5) {
                        res2 = "YES";
                        break;
                    } else res2 = "NO"; break;
                case "LIME":
                    sumLi += x;
                    if(sumLi == 5) {
                        res3 = "YES";
                        break;
                    } else res3 = "NO"; break;
                case "PLUM":
                    sumPl += x;
                    if(sumPl == 5) {
                        res4 = "YES";
                        break;
                    } else res4 = "NO"; break;
            }
        }
        if(res1.equals("YES") || res2.equals("YES") || res3.equals("YES") || res4.equals("YES")) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}