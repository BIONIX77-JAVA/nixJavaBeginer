import java.util.ArrayList;
import java.util.Arrays;

public class ArraysDuplicateAndCrossing {
    public static void main(String[] args) {
        int[] first = {1, 2, 7, 30, 5, 70, 77, 55, 66, 17, 44};
        Arrays.sort(first);
        int[] second = {1, 4, 17, 30, 33, 44, 28, 99};
        Arrays.sort(second);
        ArrayList<Integer> common = new ArrayList<>();
        ArrayList<Integer> duplicateIndexForFirst = new ArrayList<>();
        ArrayList<Integer> intersect = new ArrayList<>();

/*
        for (int p = 0; p < first.length; p++) {
            System.out.print(first[p] + " ");
        }
        System.out.println("");
        for (int n = 0; n < second.length; n++) {
            System.out.print(second[n] + " ");
        }
        System.out.println("");
*/

        for (int i = 0; i < first.length; i++) {

            for (int j = 0; j < second.length; j++) {

                if (first[i] == second[j]) {
                    common.add(first[i]);
                    duplicateIndexForFirst.add(i);
                    if (i == j) {
                        intersect.add(i);
                    }
                }
            }
        }
        System.out.println("Arrays have duplicates:  " + common.toString());
        System.out.println("Аt  the first array these are index:  " + duplicateIndexForFirst.toString());
        System.out.println("We have intersection in index:  " + intersect.toString());
    }
}