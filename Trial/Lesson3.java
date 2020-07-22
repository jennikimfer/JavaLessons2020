public class Lesson3{
    public static void main(String[] args){
        int[] grades = {90, 90, 100, 98, 80};
        grades[0] = 95;

        System.out.println(grades);
        System.out.println(grades[0]);
        
        for(int i = 0; i < grades.length; i++){
            System.out.println("Student " + (i+1) + ": " + grades[i]);
        }

        System.out.println();
        for(int grade : grades){
            System.out.print(grade + ", ");
        }

        String studentName = "Keanu";
        System.out.println(studentName.toUpperCase());
    }

    public static void printSum(int num1, int num2){
        int sum = num1 + num2; 
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }

    private static int minToSec(int min){
        int seconds = min*60;
        return seconds;
    }
}