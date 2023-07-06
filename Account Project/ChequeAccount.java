/*
 * This class represents a Cheque Account that extends the Account class.
 * It includes additional properties and methods specific to a cheque account,
 * such as an overdraft limit and interest calculation based on the balance.
 */

public class ChequeAccount extends Account {
    int overDraft;

    // Default constructor
    public ChequeAccount() {
        overDraft = 0;
    }

    // Parameterized constructor
    public ChequeAccount(String AccNumber, String AccHolder, int Balance, int overDraft) {
        super(AccNumber, AccHolder, Balance);
        setOverDraft(overDraft);
    }

    // Setter for overdraft limit
    public void setOverDraft(int overDraft) {
        this.overDraft = overDraft;
    }

    // Getter for overdraft limit
    public int getOverDraft() {
        return overDraft;
    }

    // Statement method to return the account information
    public String statement() {
        return "Account Number: " + getAccNumber() +
               " of " + getAccHolder() +
               " has Balance: " + getBalance() +
               " and OverDraft limit: " + getOverDraft();
    }

    // Calculate interest based on the provided rate and account balance
    public int CalculateInterest(int rate) {
        if (getBalance() < getOverDraft()) {
            return getBalance() * 4 * rate / 100;
        } else if (getOverDraft() <= getBalance() && getBalance() < 0) {
            return getBalance() * 2 * rate / 100;
        } else {
            return getBalance() * rate / 100;
        }
    }

    // Compare two accounts based on their account numbers
    public int compareTo(Account other) {
        return this.getAccNumber().compareTo(other.getAccNumber());
    }
}
