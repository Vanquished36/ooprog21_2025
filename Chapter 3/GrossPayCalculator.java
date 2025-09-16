public class GrossPayCalculator {

    // Method to calculate gross pay
    public static double calculateGrossPay(double hoursWorked, double hourlyRate) {
        return hoursWorked * hourlyRate;
    }

    public static void main(String[] args) {
        double hourlyRate = 22.75;

        // Example 1: 10 hours worked
        double hours1 = 10.0;
        double grossPay1 = calculateGrossPay(hours1, hourlyRate);
        System.out.println(hours1 + " hours at $" + hourlyRate + " per hour is $" + grossPay1);

        // Example 2: 25 hours worked
        double hours2 = 25.0;
        double grossPay2 = calculateGrossPay(hours2, hourlyRate);
        System.out.println(hours2 + " hours at $" + hourlyRate + " per hour is $" + grossPay2);

        // Example 3: 37.5 hours worked
        double hours3 = 37.5;
        double grossPay3 = calculateGrossPay(hours3, hourlyRate);
        System.out.println(hours3 + " hours at $" + hourlyRate + " per hour is $" + grossPay3);
    }
}