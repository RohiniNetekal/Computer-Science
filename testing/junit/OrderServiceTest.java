package testing.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderServiceTest {

    static double calculateFinalAmount(double amount, double taxRate) {
        return amount + (amount * taxRate);
    }

    @Test
    void shouldCalculateFinalAmountWithTax() {
        double result = calculateFinalAmount(1000.00, 0.18);
        assertEquals(1180.00, result, 0.001);
    }

    @Test
    void shouldReturnSameAmountWhenTaxIsZero() {
        double result = calculateFinalAmount(750.00, 0.0);
        assertEquals(750.00, result, 0.001);
    }
}

/*
 * Learning example:
 * Unit tests should verify business behavior, remain deterministic,
 * and avoid depending on external databases or network calls.
 */
