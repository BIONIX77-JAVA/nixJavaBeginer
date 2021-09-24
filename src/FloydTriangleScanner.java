import java.util.Scanner;

public class FloydTriangleScanner {
    public static void main(String[] args) {
        System.out.println("Enter the starting value for the floyd triangle");
        Scanner input = new Scanner(System.in);
        int numStart = input.nextInt();
        System.out.println("Enter the finish value for the floyd triangle");
        int numFinish = input.nextInt()+2;
        System.out.println("This is a joke from the ***   NIX  command  *** - instead of the entered one, we have plus two string");
        for (int i = 1; i < numFinish; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(numStart + " "); //For fun, you can enter a minimum string length, for example "*" instead of numStart
                numStart++;
            }
            System.out.println("");

        }
    }
}