import java.util.Scanner;

public class BankBalanceByRateAndYear {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double initialBalance;
            
            System.out.print("Enter initial bank balance > ");
            initialBalance = input.nextDouble();
            
            // Array of interest rates
            double[] interestRates = {0.02, 0.03, 0.04, 0.05};
            
            // Outer loop for interest rates
            for (int i = 0; i < interestRates.length; i++) {
                double rate = interestRates[i];
                double balance = initialBalance;
                
                System.out.println();
                System.out.printf("With an initial balance of $%.2f at an interest rate of %.2f%n",
                        initialBalance, rate);
                
                // Inner loop for years 1–4
                for (int year = 1; year <= 4; year++) {
                    balance = balance + (balance * rate);
                    System.out.printf("After year %d balance is $%.4f%n", year, balance);
                }
            }
        }
    }
}
