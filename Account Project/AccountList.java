import java.io.*;

public class AccountList {
    static ObjectOutputStream output;

    /*
     * This class represents an Account List that demonstrates file operations
     * by creating a serialized file and writing account objects to it.
     * It also performs various operations on the account objects.
     */

    public static void OpenFile() {
        try {
            output = new ObjectOutputStream(new FileOutputStream("AccountList.ser"));
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public static void CloseFile() {
        try {
            output.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public static void main(String[] args) {
        // Create an array to store Account objects
        Account aList[] = new Account[7];
        aList[0] = new SavingsAccount("1780306403", "MacArthur, D", 550, 550);
        aList[1] = new ChequeAccount("2451348675", "Peters, M", 430, -450);
        aList[2] = new SavingsAccount("1678323452", "Doe, J", 500, 250);
        aList[3] = new ChequeAccount("2357964244", "Peters, D", 230, -50);
        aList[4] = new SavingsAccount("1456723452", "Doyle, C", 340, 500);
        aList[5] = new ChequeAccount("2567843428", "Greystoke, J", -320, -50);
        aList[6] = new ChequeAccount("2678975425", "Shelley, M", -320, -500);

        // Open the file for writing
        OpenFile();
        try {
            // Write account objects to the file
            for (int i = 0; i < 7; i++) {
                output.writeObject(aList[i]);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        // Close the file
        CloseFile();

        System.out.println("List of Statements");
        for (int i = 0; i < 7; i++) {
            System.out.println(aList[i].statement());
        }

        System.out.println("Interest earned (Payable)");
        for (int i = 0; i < 7; i++) {
            // Calculate and display interest earned for each account
            System.out.println("Account Number: " + aList[i].getAccNumber() +
                    " Interest Earned (Payable): " + aList[i].CalculateInterest(10));
        }

        System.out.println("Cheque accounts with overdraft balances greater than the overdraft limit");
        for (int i = 0; i < 7; i++) {
            // Check for cheque accounts with overdraft balances greater than the overdraft limit
            if (aList[i] instanceof ChequeAccount) {
                if (aList[i].getBalance() < ((ChequeAccount) aList[i]).getOverDraft()) {
                    System.out.println(aList[i].statement());
                }
            }
        }
    }
}
