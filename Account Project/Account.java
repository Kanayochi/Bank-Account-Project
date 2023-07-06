import java.io.Serializable;

/*
 * This abstract class represents an Account that implements the Serializable and Comparable interfaces.
 * It defines common properties and methods for various types of accounts.
 */

public abstract class Account implements Serializable, Comparable<Account> {
    String AccNumber;
    String AccHolder;
    int Balance;

    // Default constructor
    public Account() {
        AccNumber = "";
        AccHolder = "";
        Balance = 0;
    }

    // Parameterized constructor
    public Account(String AccNumber, String AccHolder, int Balance) {
        setAccNumber(AccNumber);
        setAccHolder(AccHolder);
        setBalance(Balance);
    }

    // Abstract method to return the account statement
    public abstract String statement();

    // Abstract method to calculate interest based on the provided rate
    public abstract int CalculateInterest(int rate);

    // Setter for account number with validation
    public void setAccNumber(String AccNumber) {
        if (AccNumber.length() != 10) {
            throw new InvalidAccountNumberException("Account Number " + getAccNumber() + " is Invalid");
        }
        this.AccNumber = AccNumber;
    }

    // Getter for account number
    public String getAccNumber() {
        return AccNumber;
    }

    // Setter for account holder
    public void setAccHolder(String AccHolder) {
        this.AccHolder = AccHolder;
    }

    // Getter for account holder
    public String getAccHolder() {
        return AccHolder;
    }

    // Setter for account balance
    public void setBalance(int Balance) {
        this.Balance = Balance;
    }

    // Getter for account balance
    public int getBalance() {
        return Balance;
    }

    // Compare two accounts based on a combination of account number and account holder
    public int CompareTo(Account other) {
        String thisField = getAccNumber().charAt(0) + getAccHolder();
        String otherField = other.getAccNumber().charAt(0) + other.getAccHolder();
        return thisField.compareTo(otherField);
    }
}
