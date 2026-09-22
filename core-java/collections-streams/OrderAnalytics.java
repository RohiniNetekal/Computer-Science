package corejava.collectionsstreams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OrderAnalytics {

    record Order(long id, String status, double amount) {}

    public static Map<String, Double> totalsByStatus(List<Order> orders) {
        return orders.stream()
                .collect(Collectors.groupingBy(
                        Order::status,
                        Collectors.summingDouble(Order::amount)
                ));
    }

    public static Order highestValueOrder(List<Order> orders) {
        return orders.stream()
                .max(java.util.Comparator.comparingDouble(Order::amount))
                .orElseThrow(() -> new IllegalArgumentException("Order list must not be empty"));
    }

    public static Map<Long, String> orderStatusIndex(List<Order> orders) {
        return orders.stream()
                .collect(Collectors.toMap(Order::id, Order::status));
    }

    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(101, "PAID", 1250.00),
                new Order(102, "PENDING", 500.00),
                new Order(103, "PAID", 750.00),
                new Order(104, "FAILED", 300.00)
        );

        System.out.println("Totals by status: " + totalsByStatus(orders));
        System.out.println("Highest-value order: " + highestValueOrder(orders));
        System.out.println("Order status index: " + orderStatusIndex(orders));
    }
}

/*
Complexity:
- totalsByStatus: O(n) time, O(k) additional space where k is the number of statuses.
- highestValueOrder: O(n) time, O(1) additional space apart from stream internals.
- orderStatusIndex: O(n) time, O(n) additional space.

Backend relevance:
The same collection/stream operations appear in reporting, transaction summaries,
API response preparation, and batch-processing code.
*/
