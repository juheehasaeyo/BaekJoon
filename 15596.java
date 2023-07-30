import java.util.Scanner;
//15596
public class Test {
   
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        long ans = 0;       
        for(int i=0; i<a.length; i++) {
        	a[i] = sc.nextInt();
        	ans += a[i];
        }
        System.out.println(ans);
   	}
		long sum(int[] a) {
			long ans = 0;
			for(int list: a) {
				ans += list;
			}
			return ans;
		}      
}
