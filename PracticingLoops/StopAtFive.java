import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            double userInput = scanner.nextDouble();
            if (userInput == 5) {
                System.out.println("You chose correctly, pray to your god!");
                break;
            }
        }
    }
}
