import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i=0; i<str.length(); i++) {
        	char ch = str.charAt(i);
        	if(Character.isLowerCase(ch)) {
        		ch = Character.toUpperCase(ch);
        	} else {
        		ch = Character.toLowerCase(ch);
			}
            System.out.print(ch);
        }
    }
}