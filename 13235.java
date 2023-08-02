import java.util.Scanner;
//13235
public class Main {
   
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        int start = 0;
        int end = str.length()-1;
        boolean bl = true;
        
        for(int i=0; i<str.length()/2; i++) {

           if(str.charAt(start) != str.charAt(end)) {
              bl = false;
           }
           start++;
           end--;
        }    
           if(bl == false) {
              System.out.println("false");
           } else {
            System.out.println("true");
           }        
   }      
}