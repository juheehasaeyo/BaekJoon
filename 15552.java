import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
// 으음 생소하군
public class Main{
    public static void main(String[] args) throws NumberFormatException, IOException {
    	// 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));               
        
        int t = Integer.parseInt(br.readLine());
         
        for(int i=0; i<t; i++) {  
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	
        	bw.write(a+b+"\n");
        }
    	bw.flush();
    } 
}