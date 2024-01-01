import java.util.Scanner;
// 25206 너의 평점은
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double scoreSum = 0, subjectSum = 0;
        double realSubj = 0; // 과목 평점
        double res = 0; // 전공 평점
        for(int i=0; i<20; i++) {
            String subj = sc.next(); // 과목명
            double score = sc.nextDouble(); // 학점
            String level = sc.next(); // 등급
            sc.nextLine();
            if(level.equals("A+")){
                realSubj = 4.5;
            } else if(level.equals("A0")){
                realSubj = 4.0;
            } else if(level.equals("B+")){
                realSubj = 3.5;
            } else if(level.equals("B0")){
                realSubj = 3.0;
            } else if(level.equals("C+")){
                realSubj = 2.5;
            } else if(level.equals("C0")){
                realSubj = 2.0;
            } else if(level.equals("D+")){
                realSubj = 1.5;
            } else if(level.equals("D0")){
                realSubj = 1.0;
            } else if(level.equals("F")){
                realSubj = 0;
            }
            if(!level.equals("P")) {
                scoreSum += score;
                subjectSum += score * realSubj;
            }
        }
        res = subjectSum / scoreSum;
        System.out.println(res);
    }
}