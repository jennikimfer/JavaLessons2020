package Lesson5;

public class Classroom{
    public static void main(String[] args){
        Student joe = new Student("Joe", 11, 4.0);
        Student josh = new Student("Josh", 11, 2.0);

        printStats(joe.getName(), joe.getRating());
        printStats(josh.getName(), joe.getRating());
    }

    public static void printStats(String name, String rating){
        System.out.println(name + " was a " + rating + " student.");
    }
}
