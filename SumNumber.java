import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        int sum = num1 + num2 + num3;
        int sumOfLargest = largest;

        System.out.println("The sum of the largest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + sumOfLargest);

        input.close();
    }
}
