import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateInArrayDave_sAlgorithmOn {
    public static void main(String[] args) {

        Integer[] numbers = new Integer[]{1, 2, 2, 30, 5, 70, 44, 30};
        Set<Integer> allItems = new HashSet<>();
        Set<Integer> duplicates = Arrays.stream(numbers)
                .filter(n -> !allItems.add(n)) //Set.add() returns false if the item was already in the set.
                .collect(Collectors.toSet());
        System.out.println("The following digits are repeated in the array: " + duplicates);
    }
}