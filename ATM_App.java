import java.util.*;

public class ATM_App {
    public static void main(String[] args) {
        int balance = 50000;
        int pin = 54321;
        int deposit = 0;
        int withdraw = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter your password: ");

        int secret = sc.nextInt();
        String name;

        if (pin == secret) {
            System.out.println();
            System.out.println("Enter your Name: ");
            name = sc.next();
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) >= 48 && name.charAt(i) <= 57) {
                    System.out.println("** Please enter valid name **");
                    break;
                } 
                else {
                    System.out.println();
                    System.out.println("Welcome! " + name);

                    while (true) {
                        System.out.println();
                        System.out.println("Press key 1 for balance.");
                        System.out.println("Press key 2 to deposit.");
                        System.out.println("Press key 3 to withdraw.");
                        System.out.println("Press key 4 for receipt.");
                        System.out.println("Press key 5 to exit.");
                        System.out.println();

                        int choice = sc.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.println();
                                System.out.println("Your balance amount is: " + balance);
                                break;
                            case 2:
                                System.out.println();
                                System.out.println("Enter amount to add: ");
                                deposit = sc.nextInt();
                                System.out.println("Successfully! credited");
                                balance = balance + deposit;
                                break;
                            case 3:
                                System.out.println();
                                System.out.println("Enter amount to withdraw: ");
                                withdraw = sc.nextInt();
                                if (withdraw > balance) {
                                    System.out.println("Your balance amount is: " + balance);
                                    System.out.println("Enter amount less than your balance: ");
                                } else {
                                    System.out.println();
                                    System.out.println("Debited successfully!");
                                    balance = balance - withdraw;
                                }
                                break;
                            case 4:
                                System.out.println();
                                System.out.println("Welcome! to Sonic ATM");
                                System.out.println("Available balance is " + balance);
                                System.out.println("Amount deposited " + deposit);
                                System.out.println("Amount debited " + withdraw);
                                System.out.println("Thanks for your time at Sonic ATM!");
                                break;
                        }
                        if (choice == 5) {
                            System.out.println();
                            System.out.println("Thank you! See you again.");
                            System.out.println();
                            return;
                        }
                    }
                }
            }

        } else {
            System.out.println("Enter correct PIN");
        }
        sc.close();
    }
}