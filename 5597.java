import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);   
    	
    	int [] arr1 = new int[30];
    	int [] arr2 = new int[28];
    	
    	//학생 출석번호 배열 초기화
    	for(int i=0; i<arr1.length; i++) {
    		arr1[i] = i+1;
    	}
    	//제출한 학생 출석번호 입력받기
    	for(int i=0; i<arr2.length; i++) {
    		arr2[i] = s.nextInt();
    	}
    	//제출하지 않은 학생 체크
    	for(int i=0; i<30; i++) {
    		for(int k=0; k<28; k++) {
    			if(arr1[i] == arr2[k])
    				arr1[i] = 0; //제출한 학생은 출석번호를 0으로 표시
    		}
    	}
    	//제출하지 않은 학생의 출석번호 출력
    	for(int i=0; i<30; i++) {
    		if(arr1[i] != 0)
    			System.out.println(arr1[i]);
    	}
    }
}