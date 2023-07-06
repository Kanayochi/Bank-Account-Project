import java.util.*;

/*
 * This class represents a Sort Test that demonstrates sorting an array of Account objects.
 * It initializes an array of accounts and sorts them using the Arrays.sort() method.
 */

public class SortTest {
    public static void main(String[] args) {
        // Create an array to store Account objects
        Account aList[] = new Account[7];
        aList[0] = new SavingsAccount("1930306403", "Uthred, D", 550, 550);
        aList[1] = new ChequeAccount("3245348675", "Orlando, M", 420, -440);
        aList[2] = new SavingsAccount("8761323452", "Donald, T", 500, 250);
        aList[3] = new ChequeAccount("3527964255", "Pietrie, F", 230, -50);
        aList[4] = new SavingsAccount("2486714452", "Okeke, K", 340, 500);
        aList[5] = new ChequeAccount("6767842628", "Sigfried, J", -320, -50);
        aList[6] = new ChequeAccount("3978865335", "Ramahala, T", -320, -500);

        System.out.println("\nBefore Sort");
        for (int i = 0; i < 7; i++) {
            System.out.println(aList[i].statement());
        }

        // Sort the array of accounts using Arrays.sort()
        Arrays.sort(aList);

        System.out.println("\nAfter Sort");
        for (int i = 0; i < 7; i++) {
            System.out.println(aList[i].statement());
        }
    }
}
