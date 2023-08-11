import java.util.Scanner;
//2차원배열-세로읽기
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

    	char [][] arr = new char[5][15];
    	for(int i=0; i<5; i++) {
    		String str = sc.nextLine();
    		for(int j=0; j<str.length(); j++) {
    			arr[i][j] = str.charAt(j);
    		}
    	}
    	for(int i=0; i<15; i++) {
    		for(int j=0; j<5; j++) {
    			//문자열이 끝나는 지점 확인
    			if(arr[j][i] != '\0') {
    				System.out.print(arr[j][i]);
    			}
    		}
    	}
    }
}