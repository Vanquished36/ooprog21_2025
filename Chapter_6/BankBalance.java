import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double balance;
            double rate = 0.03;  // 3% interest rate by default
            int year = 0;
            int choice;
            
            System.out.print("Enter initial bank balance > ");
            balance = input.nextDouble();
            
            System.out.print("Do you want to see next year's balance?\nEnter 1 for yes or any other number for no >> ");
            choice = input.nextInt();
            
            while (choice == 1) {
                year++;
                balance = balance + (balance * rate);
                System.out.printf("After year %d at %.2f interest rate, balance is $%.1f%n", year, rate, balance);
                
                System.out.print("\nDo you want to see the balance at the end of another year?\nEnter 1 for yes or any other number for no >> ");
                choice = input.nextInt();
            }
            
            System.out.println("\nThank you. Program ended.");
        }
    }
}