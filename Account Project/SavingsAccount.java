/*
 * This class represents a Savings Account that extends the Account class.
 * It includes additional properties and methods specific to a savings account,
 * such as a minimum balance requirement and interest calculation.
 */

public class SavingsAccount extends Account {
    int minimumBalance;

    // Default constructor
    public SavingsAccount() {
        minimumBalance = 0;
    }

    // Parameterized constructor
    public SavingsAccount(String AccNumber, String AccHolder, int Balance, int minimumBalance) {
        super(AccNumber, AccHolder, Balance);
        setMinimumBalance(minimumBalance);
    }

    // Setter for minimum balance
    public void setMinimumBalance(int minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    // Getter for minimum balance
    public int getMinimumBalance() {
        return minimumBalance;
    }

    // Statement method to return the account information
    public String statement() {
        return "Account Number: " + getAccNumber() +
               " of " + getAccHolder() +
               " has Balance: " + getBalance() +
               " and Minimum balance: " + getMinimumBalance();
    }

    // Calculate interest based on the provided rate
    public int CalculateInterest(int rate) {
        if (getBalance() < getMinimumBalance()) {
            return 0;
        }
        return getBalance() * rate / 100;
    }

    // Compare two accounts based on their account numbers
    public int compareTo(Account other) {
        return this.getAccNumber().compareTo(other.getAccNumber());
    }
}
