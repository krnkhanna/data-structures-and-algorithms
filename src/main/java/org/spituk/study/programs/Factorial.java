package org.spituk.study.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Class for calculating factorial of a number.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 12/8/2018
 */
public class Factorial {

    private final static int JOB_SIZE = 10;

    private final static int AVAILABLE_PROCESSORS = Runtime.getRuntime().availableProcessors();

    /**
     * Calculates the factorial of the number with loop.
     *
     * @param number whose factorial is to be calculated.
     * @return calculated factorial of the number
     */
    public long getFactorialWithLoop(final int number) {
        long factorial = 1;
        for (int index = 2;
             index <= number;
             index++) {
            factorial = factorial * index;
        }
        return factorial;
    }


    /**
     * Calculates the factorial of the number with recursion.
     *
     * @param number whose factorial is to be calculated.
     * @return calculated factorial of the number
     */
    public long getFactorialWithRecursion(final int number) {
        return factorialRecursion(number);
    }


    /**
     * Calculates the factorial of the number with multiple threads.
     *
     * @param number whose factorial is to be calculated.
     * @return calculated factorial of the number
     */
    public long getFactorialMultiThreaded(final int number) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(AVAILABLE_PROCESSORS);
        List<PartialFactorialJob> partialFactorialJobs = new ArrayList<PartialFactorialJob>();

        int startIndex = 1;
        int pivot = JOB_SIZE;

        while (pivot <= number) {
            if (pivot + JOB_SIZE > number) {
                pivot = number;
            }
            partialFactorialJobs.add(new PartialFactorialJob(startIndex, pivot));
            startIndex = pivot + 1;
            pivot = pivot + JOB_SIZE;
        }

        try {
            long factorial = 1;
            final List<Future<Long>> futureList = executor.invokeAll(partialFactorialJobs);
            for (Future<Long> future : futureList) {
                factorial = factorial * future.get();
            }
            executor.shutdown();
            return factorial;
        } catch (InterruptedException | ExecutionException e) {
            throw new Exception("Factorial couldn't be calculated.");
        }
    }


    private long factorialRecursion(final int number) {
        if (number <= 0) {
            return 1;
        }
        return number * factorialRecursion(number - 1);
    }

    private class PartialFactorialJob implements Callable<Long> {

        private final int startIndex;
        private final int endIndex;

        PartialFactorialJob(final int startIndex, final int endIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        public Long call() {
            long partialFactorial = 1;
            int temp = startIndex;
            while (temp <= endIndex) {
                partialFactorial = partialFactorial * temp;
                temp++;
            }
            return partialFactorial;
        }
    }
}
