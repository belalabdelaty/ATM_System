import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 5000; 

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Withdraw money");
            System.out.println("2. Deposit money");
            System.out.println("3. Check balance") ;
            System.out.println("4. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter withdrawal amount:");
                    int withdrawAmount = scanner.nextInt();
                    if (withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawn: " + withdrawAmount);
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    break;
                case 2:
                    System.out.println("Enter deposit amount:");
                    int depositAmount = scanner.nextInt();
                    balance += depositAmount;
                    System.out.println("Deposited: " + depositAmount);
                    break;
                case 3:
                    System.out.println("Your balance: " + balance);
                    break;
                case 4:
                    System.out.println("Exiting the program");
                    return;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}

