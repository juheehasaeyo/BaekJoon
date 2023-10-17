import java.util.Scanner;
//11098
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int p = sc.nextInt();
            int max = 0;
            String res = "";
            for(int j=0; j<p; j++) {
                int c = sc.nextInt();
                String name = sc.next();
                if(max < c) {
                    max = c;
                    res = name;
                }
            }
            System.out.println(res);
        }
    }
}
/*
        int n = sc.nextInt();
        int p = sc.nextInt();

        for(int i=0; i<p; i++){
            int max = 0;
            HashMap<Integer,String> map = new HashMap<>();
            for(int j=0; j<p; j++){
                int c = scanner.nextInt();
                String name = sc.next();
                map.put(c,name);
                max = Math.max(max,c);
            }
            System.out.println(map.get(max));
 */