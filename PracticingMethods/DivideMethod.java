import java.util.Scanner;

public class DivideMethod {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number:");
    double numOne = scanner.nextDouble();
    System.out.println("Enter another number:");
    double numTwo = scanner.nextDouble();
    divide(numOne, numTwo);  
    }
    public static void divide(double numOne, double numTwo) {
        System.out.println(numOne + " / " + numTwo + " = " + numOne / numTwo);
        return;
    }
}
