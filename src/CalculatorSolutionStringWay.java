public class CalculatorSolutionStringWay {
    private static String multiplication(int s) {
        int a = 1, g = 1;
        String n = "";//this variable specifically for return
        while (a < 11) {//the creation of row containing 10 values (s * g + " ") of the cycle
            System.out.print(s * g + " ");
            a++;//the counter of cycle
            g++;//the multiplier of every value of row
        }
        return n;//it`s returns String n = null, because that is 11th element of every row.
    }

    public static void main(String[] args) throws Exception {
        int a = 1, s = 1;//argument "s" is main value of elements table. It is sets first element of every row and etc
        while (a < 11) {//the cycle of creation tabulation of 10 rows
            System.out.println(multiplication(s++));//10 calls of the method with the argument "s"
            a++;
        }
    }
}
