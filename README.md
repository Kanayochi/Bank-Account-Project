# Bank-Account-Project
 A Java-based system for managing bank accounts, performing operations like reading/writing data, calculating interest, and sorting accounts. Ideal for learning and building banking applications.
# Java Account Management System

The Java Account Management System is a simple application that demonstrates the management of bank accounts. It provides functionality for creating different types of accounts, such as savings accounts and cheque accounts, performing operations like reading and writing account data to files, calculating interest based on account types and balances, sorting accounts, and handling custom exceptions.

## Features

- **Account Creation**: Create various types of bank accounts including savings accounts and cheque accounts.
- **File Operations**: Read and write account data to serialized files, allowing for data persistence.
- **Interest Calculation**: Calculate interest based on the type of account and its balance.
- **Sorting**: Sort the accounts based on different criteria such as account number or account holder's name.
- **Exception Handling**: Handle custom exceptions, such as invalid account numbers, with appropriate error messages.

## How to Use

1. Clone the repository to your local machine.
2. Compile the Java source files using the command: `javac *.java`.
3. Run the application by executing the command: `java ReadData`.
4. Follow the on-screen instructions to create and manage bank accounts.
5. View the list of statements to see the details of each account.
6. Calculate interest for each account based on the provided rate.
7. Sort the accounts using the built-in sorting mechanism.
8. Observe how the application handles exceptions related to invalid account numbers.

## Project Structure

The project consists of the following main classes:

- `Account`: An abstract class that serves as the base class for different account types.
- `SavingsAccount`: A subclass of `Account` representing a savings account.
- `ChequeAccount`: A subclass of `Account` representing a cheque account.
- `InvalidAccountNumberException`: A custom exception class for handling invalid account numbers.
- `ReadData`: The main class that demonstrates reading, writing, and performing operations on account objects.

Feel free to explore the codebase and modify it according to your needs. You can add more functionality, implement additional account types, or enhance the user interface as desired.

## Contributions

Contributions to the Java Account Management System are welcome! If you have any suggestions, improvements, or bug fixes, please feel free to submit a pull request or open an issue on the repository.

## About

This project serves as a learning resource and example for Java developers interested in understanding and implementing account management systems. It can be used as a foundation for building more complex banking applications.

## Contact

For any questions or inquiries, please contact me on (jozzephokeke@gmail.com).

