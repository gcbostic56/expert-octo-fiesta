import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input a number:");
            double userInput = scanner.nextDouble();
            for (double i = 1; i <= 10; i++) {
                System.out.println(userInput+ " x " + i + " = " + userInput * i);
            }
            if (userInput < 0) {
                System.out.println("Enter a positive number, please.");
                continue;
            }
            break;
        }   
    }
}
