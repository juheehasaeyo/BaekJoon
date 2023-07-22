import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[26];
		for(int i=0; i<arr.length; i++) {
			arr[i] = 0;
		}
		String S = sc.next();
		for(int i=0; i<S.length(); i++) {
			//문자열 S의 i번째 위치에 있는 문자를 반환하여 이를 변수 ch에 저장
			char ch = S.charAt(i); 
			arr[ch-'a']++;
		}
		for(int i=0; i<26; i++) {
			System.out.print(arr[i]+" ");
		}		
	}	
}