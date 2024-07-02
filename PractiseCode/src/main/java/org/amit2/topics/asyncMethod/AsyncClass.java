package org.amit2.topics.asyncMethod;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsyncClass {
    public static void main (String[] args){

        CompletableFuture<Integer> future = new CompletableFuture<>();
        new Thread(()->{
            try {
                Thread.sleep(2000);
                future.complete(42);
            } catch (InterruptedException e) {
                future.completeExceptionally(e);
            }
        }).start();
        Integer result = null;
        try {
            result = future.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Result: " + result);

    //---------------------------------------------------------------------------------------------

        System.out.println("Main thread: Starting an asynchronous operation...");

        CompletableFuture<String> fetchDataFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "John Doe's data";
        });

        System.out.println("Main thread: Continuing its own execution...");

        String fetchedData = null;
        try {

            fetchedData = fetchDataFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main thread: Processing fetched data2...");
        try {

            fetchedData = fetchDataFuture.get();
            System.out.println("Inside data: " + fetchedData);
            for(int i = 0 ; i < 5 ; i++)
            {
                System.out.println("Inside : {}" + i);

            }
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Fetched data: " + fetchedData);

        System.out.println("Main thread: Continuing with other operations...");

        System.out.println("Main thread: All tasks completed.");
    }
}