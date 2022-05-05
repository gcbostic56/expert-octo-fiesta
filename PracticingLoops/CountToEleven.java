import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number less than 11:");
            double userInput = scanner.nextDouble();
            for (double i = userInput; i < 12; i++) {
                System.out.println(i);
            }
            if (userInput > 11) {
                System.out.println("That number is greater than 11.");
                continue;
            }
            break;
        }   
}
}
