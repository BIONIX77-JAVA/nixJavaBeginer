package com.company.Bionix;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class FibonacciCancelableTask implements Callable {
    int maxCountNumber;
    long previousNumber;
    long nextNumber;

    public FibonacciCancelableTask(int maxCountNumber, long previousNumber, long nextNumber) {
        this.maxCountNumber = maxCountNumber;
        this.previousNumber = previousNumber;
        this.nextNumber = nextNumber;
    }


    @Override
    public Object call() {
        System.out.print("Fibonacci Series of " + maxCountNumber + " numbers in method: \n");

        ArrayList<Long> fibNum = new ArrayList<>();

        for (int i = 1; i <= maxCountNumber; ++i) {
            System.out.println("Starting iteration # " + i + ". Write num " + previousNumber + " in method's array ");
            fibNum.add(previousNumber);
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Interrupted quitting...........");}
//            try {
//            System.out.println("Let's pause the execution of the code for a while. ");
//                Thread.sleep(1000);
//            } catch (InterruptedException interruptedException) {
//                interruptedException.printStackTrace();
//            }
                long sum = previousNumber + nextNumber;
                previousNumber = nextNumber;
                System.out.println(" end we getting next number : " + nextNumber);
                nextNumber = sum;
            }
        System.out.println("Return to executor next array of Fibonacci num : " + fibNum);
        return fibNum;
    }
}
