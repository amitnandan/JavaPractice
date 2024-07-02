package org.amit2.topics.asyncMethod;

import java.util.concurrent.CompletableFuture;

public class Async2 {
    public static void main (String[] args) {

        System.out.println("START");
        CompletableFuture<Integer> asyncc = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 1;

        });

        System.out.println("MID");
        //main thread other proccess running
        CompletableFuture<Integer> consumAsyncc = asyncc.thenApply((a)->{

            return (a+1);
        });
        consumAsyncc.thenAccept(System.out::println);

        System.out.println("END");
        consumAsyncc.join();

        System.out.println("END2");

    }
}
