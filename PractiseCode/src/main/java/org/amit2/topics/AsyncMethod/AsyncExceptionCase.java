package org.amit2.topics.AsyncMethod;

import java.util.concurrent.CompletableFuture;

public class AsyncExceptionCase {

    public static void main(String[] args) {


        CompletableFuture<String> random = CompletableFuture.supplyAsync(()->{
            try {
                // Simulate a failure condition
                if (Math.random() < 0.5) {
                    throw new RuntimeException("Failed to fetch data");
                }
                Thread.sleep(2000); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return  "Success";});
        CompletableFuture<String> er = random.exceptionally(throwable -> {
            return "Exception occurred: " + throwable.getMessage(); // Provide a default value in case of failure
        });
        System.out.println(er.join());

    }
}