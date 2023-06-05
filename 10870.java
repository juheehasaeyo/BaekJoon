import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] array = new int[100];
        array[0]=0;
        array[1]=1;
        array[2]=1;
        for(int i=3; i<array.length; i++){
            array[i] = array[i-1]+array[i-2];
        }
        System.out.println(array[n]);
    }
}