import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Input your first value: ");
        int num1 = scan.nextInt();
        System.out.print("Input your second value: ");
        int num2 = scan.nextInt();
        System.out.print("Input your third value: ");
        int num3 = scan.nextInt();
        System.out.print("Input your fourth value: ");
        int num4 = scan.nextInt();
        System.out.print("Input your fifth value: ");
        int num5 = scan.nextInt();
        System.out.print("Input your sixth value: ");
        int num6 = scan.nextInt();

        int[] arr1 = {num1, num2, num3};
        int[] arr2 = {num4, num5, num6};

        if(arr1[0] == arr1[2]){
            System.out.println("The first and last integers of the first array are the same.");
        } else{
            System.out.println("The first and last integers of the first array are not the same.");
        }
        
        if(arr2[0] == arr2[2]){
            System.out.println("The first and last integers of the second array are the same.");
        } else{
            System.out.println("The first and last integers of the second array are not the same.");
        }

        int[] arr3 = {arr1[0], arr2[0], arr1[2], arr2[2]};
        System.out.println(arr3);

        int[] arr4 = new int[2];
        for(int i = 2; i >= 0; i--){
            arr4[2-i] = arr1[i];
        }
        System.out.println(arr4);

        int tempNum = arr2[2];
        arr2[2] = arr2[0];
        arr2[0] = tempNum;
        System.out.println(arr2);

    }
}