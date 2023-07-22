import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//2진수, 8진수, 16진수를 10진수로 변환할 때 자바 내장 함수 Integer.parseInt() 사용
		//parseInt는 String타입을 int타입으로 변환
		//사용법: Integer.parseInt(String Type, n진수)
		String str =sc.next();
		System.out.println(Integer.parseInt(str,16));
	}	
}