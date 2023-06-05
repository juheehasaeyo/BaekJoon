import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt(); //정수의 개수 입력
        
        int [] input = new int[num]; //정수 배열 생성- 생성될 배열의 개수를 입력한 num으로 받기      
        
        for(int i=0; i<num; i++) {
        	input[i] = s.nextInt();			   
        }
        int v = s.nextInt(); //찾으려고 하는 정수
        int count = 0; //개수 세기
        
        for(int i=0; i<num; i++) {
        	if(input[i] == v)
        		count++;
        }
        System.out.println(count);        
    }
}