package springboot.errorhandling;

import java.time.Instant;

public final class GlobalExceptionHandler {

    public record ErrorResponse(
            Instant timestamp,
            String code,
            String message) {}

    public ErrorResponse merchantNotFound(long merchantId) {
        return new ErrorResponse(
                Instant.now(),
                "MERCHANT_NOT_FOUND",
                "Merchant " + merchantId + " was not found");
    }

    public ErrorResponse validationError(String message) {
        return new ErrorResponse(
                Instant.now(),
                "VALIDATION_ERROR",
                message);
    }

    /*
     * In a Spring Boot application this response model can be returned
     * from @RestControllerAdvice + @ExceptionHandler methods.
     * Keeping the model framework-independent also makes the contract easy to test.
     */
}
