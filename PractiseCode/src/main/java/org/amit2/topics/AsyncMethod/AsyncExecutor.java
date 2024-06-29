package org.amit2.topics.AsyncMethod;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AsyncExecutor {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);
        Future<Integer> future = executor.submit(() -> {
            return 10;
        });
        try {
            Integer result = future.get(); // Blocks until computation completes
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }


    }
}