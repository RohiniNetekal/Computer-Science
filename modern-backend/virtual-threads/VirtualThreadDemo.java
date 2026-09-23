import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Small Java 21+ example showing the basic virtual-thread-per-task model.
 *
 * This is a learning example. The simulated method represents blocking I/O
 * such as a database or HTTP call; it is not CPU-bound work.
 */
public class VirtualThreadDemo {

    public static void main(String[] args) throws Exception {
        List<String> merchantIds = List.of("M101", "M102", "M103", "M104");

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            List<Future<String>> futures = merchantIds.stream()
                    .map(id -> executor.submit(() -> loadMerchant(id)))
                    .toList();

            for (Future<String> future : futures) {
                System.out.println(future.get());
            }
        }
    }

    private static String loadMerchant(String merchantId) throws InterruptedException {
        // Represents blocking I/O, not CPU-intensive computation.
        Thread.sleep(100);
        return "Loaded merchant: " + merchantId;
    }
}
