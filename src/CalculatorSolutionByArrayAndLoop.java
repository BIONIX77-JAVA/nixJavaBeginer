public class CalculatorSolutionByArrayAndLoop {

    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : n) {
            for (int a : n) {
                System.out.printf("%4d", (i * a));
            }
            System.out.println();
        }
    }
}