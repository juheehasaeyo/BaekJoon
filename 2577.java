import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        int result = A * B * C;
        
        //결과를 문자열로 반환
        String str = Integer.toString(result);
        for(int i=0; i<10; i++) {
        	int count = 0;        	
        	for(int j=0; j<str.length(); j++) {
        		//결과 문자열에서 해당 위치의 문자를 숫자로 변환
        		if(str.charAt(j)-'0' == i)
        			count++;
        	}
        	System.out.println(count);
        }       
    }
}