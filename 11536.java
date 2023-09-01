import java.util.Scanner;
//11536 줄 세우기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] arr = new String[n];
        for(int i=0; i<n; i++) {
        	arr[i] = sc.next();
        }
        boolean increasing = true;
        boolean decreasing = true;
        
        for(int i=1; i<n; i++) {
        	//이전 이름과 비교해서 감소하는 순서인지 확인
        	if(arr[i-1].compareTo(arr[i]) < 0 ) {
        		decreasing = false;
        	} else if (arr[i-1].compareTo(arr[i]) > 0) {
        		increasing = false;
			}
        }
        if(increasing) {
    		System.out.println("INCREASING");
    	} else if (decreasing) {
    		System.out.println("DECREASING");
	} else {
		System.out.println("NEITHER");
	}
    }
}