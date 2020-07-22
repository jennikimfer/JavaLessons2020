package Lesson5;

public class Student {

    public String name;
    public int grade;
    public double gpa;

    public Student(String name, int grade, double gpa){
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public int getGrade(){
        return grade;
    }

    public double getGpa(){
        return gpa;
    }

    public String getRating(){
        if(gpa == 4){
            return "perfect";
        } else if(gpa >= 3){
            return "good";
        } else if(gpa >= 2){
            return "ok";
        } else if(gpa >= 1){
            return "bad";
        } else{
            return "failing";
        }
    }
}