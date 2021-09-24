import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the number of  digits you want to add ");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        int sum = 0;

        while (num != 0) {
            sum += (num % 10);
            num /= 10;
        }
        System.out.println(sum + " is the sum of all digits in your number");
    }
}
