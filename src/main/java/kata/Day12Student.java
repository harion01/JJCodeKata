package kata;

import java.util.ArrayList;

public class Day12Student extends Day12Person{
    ArrayList<Integer> testScores;
    String grade = "";

    Day12Student(String info, int elementCount, String scoreList) {
        super(info);
        this.testScores = new ArrayList<>();
        String[] split = scoreList.split(" ");
        for(int i = 0; i < elementCount; i++){
            this.testScores.add(Integer.parseInt(split[i]));
        }
    }

    public void calculate(){
        int sum = 0;
        for(int i = 0; i < this.testScores.size(); i++){
            sum += this.testScores.get(i);
        }
        int average = sum / this.testScores.size();
        if(average >= 90){
            grade = "O";
        }else if(average >= 80){
            grade = "E";
        }else if(average >= 70){
            grade = "A";
        }else if(average >= 55){
            grade = "P";
        }else if(average >= 40){
            grade = "D";
        }else{
            grade = "T";
        }
    }

    public String makeScore(){
        return "Grade: " + this.grade;
    }

    public void printStudent() {
        System.out.println(this.makeName());
        System.out.println(this.makeID());
        System.out.println(this.makeScore());
    }



}
