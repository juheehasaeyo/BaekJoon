import java.util.Scanner;

public class Main{
	public static void main(String[] args){
       Scanner s = new Scanner(System.in);
      
       int [] arr = new int[10];
       int [] count = new int[10];
       int sum = 0, avg = 0;
       
       for(int i=0; i<arr.length; i++) {
    	   arr[i] = s.nextInt();
    	   sum += arr[i];
       }
       avg = sum/10;
       //각 숫자의 등장 횟수 계산
       for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				if(arr[j] == arr[i])
					count[i]++;
			}
		}
       //최빈값 숫자의 인덱스를 저장할 변수
		int index = 0;
		for (int i=1; i<count.length; i++) {
			if(count[index] < count[i]){
				index = i;
			}
		}
		System.out.println(avg+"\n"+arr[index]);
    }
}