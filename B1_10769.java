import java.util.Scanner;
// 10769 행복한지 슬픈지
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split("");
        int happycnt = 0, sadcnt = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i].equals(":")){
                if (arr[i+1].equals("-")){
                    if (arr[i+2].equals(")")){
                        happycnt++;
                    } else if(arr[i+2].equals("(")){
                        sadcnt++;
                    }
                }
            }
        }
        if(happycnt > sadcnt) {
            System.out.println("happy");
        } else if (happycnt < sadcnt) {
            System.out.println("sad");
        } else if(happycnt >= 1 && sadcnt >= 1 && happycnt == sadcnt) {
            System.out.println("unsure");
        } else if(happycnt == 0 && sadcnt == 0) {
            System.out.println("none");
        }
    }
}