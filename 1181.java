import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
// 1181 단어 정렬
// Comparator 사용법
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] arr = new String[n];
        // 개행을 버려야 함!
        sc.nextLine();
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextLine();
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // 단어 길이가 같으면
                if(s1.length() == s2.length()) {
                    return s1.compareTo(s2); // 사전 순으로 정렬
                } else {
                    return s1.length() - s2.length(); // 단어 길이로 정렬
                }
            }
        });
        // 중복을 제거하고 정렬된 배열의 첫 번째 원소 출력
        System.out.println(arr[0]);
        // 중복되지 않는 문자열만 출력
        for(int i=1; i<n; i++) {
            // 중복되는 문자열은 이전 문자열과 같지 않을 때만 출력
            if(!arr[i].equals(arr[i-1])) {
                System.out.println(arr[i]);
            }
        }
    }
}