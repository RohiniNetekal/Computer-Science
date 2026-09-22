package corejava.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureDemo {
    static CompletableFuture<String> fetchMerchant() {
        return CompletableFuture.supplyAsync(() -> {
            sleep(100);
            return "Merchant-101";
        });
    }

    static CompletableFuture<Integer> fetchTransactionCount() {
        return CompletableFuture.supplyAsync(() -> {
            sleep(150);
            return 42;
        });
    }

    public static void main(String[] args) {
        CompletableFuture<String> summary =
                fetchMerchant()
                        .thenCombine(fetchTransactionCount(),
                                (merchant, count) -> merchant + " has " + count + " transactions");
        System.out.println(summary.join());
    }

    private static void sleep(long millis) {
        try {
            TimeUnit.MILLISECONDS.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Task interrupted", e);
        }
    }
}

/*
Backend relevance:
Independent I/O-bound operations can run concurrently and be combined
before preparing an API response. Production systems also need
executor sizing, timeouts, failure handling, and tracing.
*/
