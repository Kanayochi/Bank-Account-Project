/*
 * This code reads data from a serialized file "AccountList.ser" and displays a list of statements.
 * It demonstrates how to open a file, read serialized objects, and print the statements.
 */

import java.io.*;

public class ReadData {
    private ObjectInputStream input;

    // Opens the file for reading
    public void OpenFile() {
        try {
            input = new ObjectInputStream(new FileInputStream("AccountList.ser"));
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    // Reads the serialized objects from the file and prints the statements
    public void ReadFile() {
        try {
            System.out.println("\nList of Statements");

            while (true) {
                try {
                    Object object = input.readObject();

                    if (object instanceof Account) {
                        Account record = (Account) object;
                        System.out.println(record.statement());
                    }
                } catch (EOFException e) {
                    break; // Reached the end of the file, exit the loop
                } catch (ClassNotFoundException e) {
                    System.out.println("Error: Invalid object found in file");
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    // Closes the file
    public void CloseFile() {
        try {
            input.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public static void main(String[] args) {
        // Create an instance of ReadData
        ReadData test = new ReadData();

        // Open the file
        test.OpenFile();

        // Read and print the statements
        test.ReadFile();

        // Close the file
        test.CloseFile();
    }
}
