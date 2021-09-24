import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class ArraySortNum {
    public static void main(String[] args) throws IOException {
        BufferedReader toArray = new BufferedReader(new InputStreamReader(System.in));
        int[] numbersToSort = new int[7];
        for (int i = 0; i <= 6; i++) {
            System.out.println("Enter your digit to array");
            numbersToSort[i] = Integer.parseInt(toArray.readLine());
        }
        Arrays.sort(numbersToSort);

        System.out.println(Arrays.toString(numbersToSort));
        int max = numbersToSort.length - 1;
        System.out.println("min = " + numbersToSort[0] + ", max = " + numbersToSort[max]);
        System.out.println("The sum of the first and last digits of the array equals: " + (numbersToSort[0] + numbersToSort[max]));
        int[] arrayToInvert = {1,2,7,30,5,70,44};
        MethodsAboveArrays.invert(arrayToInvert);
        System.out.println("You have your inverted array :" + Arrays.toString(arrayToInvert));
    }
}