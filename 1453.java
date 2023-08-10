import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

    	int N = sc.nextInt();
    	boolean [] arr = new boolean[104];
    	int count = 0;
    	
    	for(int i=0; i<N; i++) {
    		int x = sc.nextInt();
    		if(arr[x] == false) { //아직 해당 숫자가 등장하지 않았다면
    			arr[x] = true; //숫자 등장 여부를 true로 설정
    		} else { //이미 등장한 숫자라면
			count++; //동일한 숫자가 나온 횟수 증가
		}
    	}
    	System.out.println(count);
      }
}