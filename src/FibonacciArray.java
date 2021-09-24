public class FibonacciArray {
    public static void main(String[] args) {

        //number of elements to generate in a series
        int limit = 10;

        long[] fib = new long[limit];

        //create first 2 series elements
        fib[0] = 1;
        fib[1] = 1;

        //create the Fibonacci series and store it in an array
        for (int i = 2; i < limit; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        //print the Fibonacci series numbers
        System.out.println("Fibonacci Series upto " + limit);
        for (int i = 0; i < limit; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}