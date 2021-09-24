import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class ArrayOfNum {
    public static void main(String[] args) {

        int[] multiple = new int[]{1, 2, 3, 4, 7, 15};

        System.out.println("Enter 9 numbers to form array");

        double[] fromLoop = new double[9];
        for (int i = 0; i < 9; i++) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextDouble()) {
                fromLoop[i] = sc.nextDouble();
            }
        }
        sort(fromLoop);
        System.out.println(Arrays.toString(fromLoop));
        System.out.println(Arrays.toString(multiple));
    }
}