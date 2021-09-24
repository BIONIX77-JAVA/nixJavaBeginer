import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("print first num");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("print second num");
        int b = Integer.parseInt(reader.readLine());
        DoOperations(a, b);
    }

    private static void DoOperations(int a, int b) {
        System.out.println("You have next result of operations : \n " + " + " + (a + b) + "\n" + " - " + (a - b) + "\n" + " * " + (a * b) + "\n" + " / " + (a / b));
    }
}