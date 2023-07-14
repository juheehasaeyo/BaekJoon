import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] input = {"A", "B", "C", "D", "E"};
        List<String> combinations = generateCombinations(input);
        for (String combination : combinations) {
            System.out.print(combination + " ");
        }
    }

    public static List<String> generateCombinations(String[] input) {
        List<String> combinations = new ArrayList<>();

        // 각 숫자들의 조합을 생성
        for (int i=0; i<input.length; i++) {
            String num1 = input[i];

            for (int j=i+1; j<input.length; j++) {
                String num2 = input[j];

                // 조합을 문자열로 생성
                String combination = num1 + num2;
                // 조합을 리스트에 추가
                combinations.add(combination);
            }
        }
        return combinations;
    }
}