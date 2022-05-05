import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number:");
            double userInput = scanner.nextDouble();
            System.out.println("Number is " + userInput);
            if (userInput % 2 == 0) {
                System.out.println("Congrats, the number is divisible by 2. Collect $200 and Pass Go!");
                break;
            }
            else if (userInput < 0) {
                System.out.println("Number must be a positive number.");
            }
    }
}
}
