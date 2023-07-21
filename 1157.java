import java.util.Scanner;
//1157
public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		//알파벳 개수 26
		int [] alpha = new int[26];
		String str = s.next();
		str = str.toUpperCase();
		
		//대문자 A~Z 범위에 해당하는 알파벳만 카운트
		for(int i=0; i<str.length(); i++) {
			alpha[str.charAt(i) -'A']++;
		}
		int max = 0;
		char ch = '?';
		for(int i=0; i<alpha.length; i++) {
			if(alpha[i] > max) {
				max = alpha[i];
				ch = (char)(i+'A');
        			} else if(alpha[i] == max) {
        				ch = '?';
        			}
		}
		System.out.println(ch);
	}	
}