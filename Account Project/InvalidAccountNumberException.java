/*
 * This class represents a custom exception for an invalid account number.
 * It extends the RuntimeException class and provides constructors for
 * creating an exception instance with a default or custom error message.
 */

public class InvalidAccountNumberException extends RuntimeException {

    // Default constructor with a default error message
    public InvalidAccountNumberException() {
        this("Invalid Account Number");
    }

    // Constructor with a custom error message
    public InvalidAccountNumberException(String message) {
        super(message);
    }
}
