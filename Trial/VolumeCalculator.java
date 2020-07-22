import java.util.Scanner;

public class VolumeCalculator {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Are you finding the volume of a sphere (s), rectangular prism (r), cone (co), or cylinder (cy)?");
        String shape = scan.nextLine();

        double radius;
        double length;
        double width;
        double height;

        switch(shape){
            case "s":
                System.out.print("Input the radius: ");
                radius = scan.nextDouble();
                printSVolume(radius);
                break;
            case "r":
                System.out.print("Input the length: ");
                length = scan.nextDouble();
                System.out.print("Input the width: ");
                width = scan.nextDouble();
                System.out.print("Input the height: ");
                height = scan.nextDouble();
                printRVolume(length, width, height);
                break;
            case "co":
                System.out.print("Input the radius: ");
                radius = scan.nextDouble();
                System.out.print("Input the height: ");
                height = scan.nextDouble();
                printCoVolume(radius, height);
                break;
            case "cy":
                System.out.print("Input the radius: ");
                radius = scan.nextDouble();
                System.out.print("Input the height: ");
                height = scan.nextDouble();
                printCyVolume(radius, height);
                break;
            default:
                System.out.println("That is not a valid shape.");
        }
    }

    public static void printSVolume(double radius){
        double volume = 4*radius*radius*radius*Math.PI/3;
        printVolume("sphere", volume);
    }

    public static void printRVolume(double length, double width, double height){
        double volume = length*width*height;
        printVolume("rectangular prism", volume);
    }

    public static void printCoVolume(double radius, double height){
        double volume = radius*radius*Math.PI*height/3;
        printVolume("cone", volume);
    }

    public static void printCyVolume(double radius, double height){
        double volume = radius*radius*Math.PI*height;
        printVolume("cylinder", volume);
    }

    public static void printVolume(String shape, double volume){
        System.out.println("The volume of the " + shape + " is " + volume + ".");
    }
}