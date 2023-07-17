import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        //a~z까지 26개의 알파벳
        int [] arr = new int[26];
        for(int i=0; i<arr.length; i++) {
        	//arr배열의 모든 값을 -1로 초기와
        	arr[i] = -1;
        }
        String str = s.next();
        for(int i=0; i<str.length(); i++) {
        	char ch = str.charAt(i);
        	if(arr[ch-'a'] == -1) {
        		arr[ch-'a'] = i;
        	}
        }
        for(int list: arr) {
        	System.out.print(list + " ");
        }
    }
}