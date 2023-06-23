import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);   
       
       int a = s.nextInt();
       int b = s.nextInt();
       int c = s.nextInt();
       
       int [] arr = {a,b,c};
       Arrays.sort(arr);
       
       if(arr[0] + arr[1] > arr[2]) {    	  
    	   System.out.println(arr[0]+arr[1]+arr[2]);    	   
       }
       else { //가장 큰 둘레를 구하기 위해 세 변 중 가장 큰 값을 두 번 더해야.
		System.out.println(2*(arr[0]+arr[1])-1);
       }
    }
}