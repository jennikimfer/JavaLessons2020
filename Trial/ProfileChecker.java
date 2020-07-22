import java.util.Scanner;

public class ProfileChecker {

    public final static int DAYS_IN_YEAR = 365;

    // main class
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scan.nextLine();

        System.out.println("What's your gender?");
        char gender = scan.next().charAt(0);
        
        System.out.println("How old are you?");
        int age = scan.nextInt();

        System.out.println("What year were you born in?");
        int year = scan.nextInt();

        System.out.println("How much money do you have?");
        double money = scan.nextDouble();

        System.out.println("\nHere is your information: \nName: " + name +
            "\nGender: " + gender + 
            "\nAge: " + age + 
            "\nBirth Year: " + year + 
            "\nMoney: " + money + "\n");

        if(verifyAge(age, year)){
            System.out.println("You are " + age);
        } else{
            System.out.println("You are not " + age);
        }

        System.out.println("In days, you would be " + toDays(age) + " days old");

        int sum = year+age;
        System.out.println("Hello World");
        System.out.println("Hello world" + sum);

    }

    public static boolean verifyAge(int age, int birthYear){
        int currentYear = 2020;
        int calcAge = currentYear - birthYear;
        return age == calcAge;
    }

    /**
     * @param years
     * @return days
     */

     // helloWorld
     // HELLO_WORLD

    public static int toDays(int years){
        int days = years * DAYS_IN_YEAR;
        //System.out.println("days: " + days);
        return days;
    }
/*
    public static int toDays(int months){
        int days = months*30;
        //System.out.println("months:" + months);
        return days;
    }
*/
}