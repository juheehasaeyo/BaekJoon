import java.util.ArrayList;
import java.util.Scanner;
//1076
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //색을 순서대로 집어넣은 String 배열
        String [] color = {"black", "brown", "red", "yellow", "green", "blue", "violet", "grey", "white"};

        String one = sc.next();
        String two = sc.next();
        String three = sc.next();

        ArrayList<String> list = new ArrayList<>();
        list.add("black"); // index = 0
        list.add("brown"); // index = 1
        list.add("red"); // index = 2
        list.add("orange"); // index = 3
        list.add("yellow"); // index = 4
        list.add("green"); // index = 5
        list.add("blue"); // index = 6
        list.add("violet"); // index = 7
        list.add("grey"); // index = 8
        list.add("white"); // index = 9

        long result = 0;
        result += list.indexOf(one) * 10;
        result += list.indexOf(two);
        //three 값에 10의 제곱승을 곱해줌
        result *= Math.pow(10, list.indexOf(three));

        System.out.println(result);
    }
}