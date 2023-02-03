package testTasks.meaningLife;

import java.util.concurrent.*;

public class MeaningOfLife {

    private final ExecutorService executor = Executors.newFixedThreadPool(30);

    Future<Integer> thinkSomewhereElse(Integer theMeaningOfLife) {
        return executor.submit(() -> {
            Thread.sleep(1000L);
            return theMeaningOfLife + 6;
        });
    }

    CompletableFuture<Integer> thinkDifferent(Integer theMeaningOfLife) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return theMeaningOfLife + 10;
        });
    }

    static void tellTheMeaningOfLife(Integer theMeaningOfLife) {
        System.out.println(theMeaningOfLife);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Integer theMeaningOfLife = 42;

        MeaningOfLife meaningOfLife = new MeaningOfLife();

        Future<Integer> theMeaningOfLifeFromOtherPlace = meaningOfLife.thinkSomewhereElse(theMeaningOfLife);
        meaningOfLife.thinkDifferent(theMeaningOfLife).thenAccept(MeaningOfLife::tellTheMeaningOfLife);
        tellTheMeaningOfLife(theMeaningOfLifeFromOtherPlace.get());
        tellTheMeaningOfLife(theMeaningOfLife);
    }
}
