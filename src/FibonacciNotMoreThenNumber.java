import java.util.Scanner;

public class FibonacciNotMoreThenNumber {
    public static void main(String[] args) {

        int maxNum = 0;
        int previousNumber = 0;
        int nextNumber = 1;
        int sum = 0;

        System.out.println("What number do you want to check in Fibonacci:");
        Scanner scanner = new Scanner(System.in);
        maxNum = scanner.nextInt();
        System.out.print("Fibonacci Series of " + maxNum + " numbers:");

        do {
            System.out.print(previousNumber + " ");
            sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        } while (previousNumber < maxNum);
    }
}