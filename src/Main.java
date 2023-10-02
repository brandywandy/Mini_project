import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Step 1: Initialize Variables
        double totalBill = 0.0;
        int tipPercentage = 0;
        int numPeople = 0;
        double totalTip = 0.0;
        double totalBillWithTip = 0.0;
        double tipPerPerson = 0.0;
        double totalPerPerson = 0.0;

        // Step 2: Input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total bill amount: $");
        totalBill = scanner.nextDouble();

        System.out.print("Enter the tip percentage (as a whole number): ");
        tipPercentage = scanner.nextInt();

        System.out.print("Enter the number of people in the party: ");
        numPeople = scanner.nextInt();

        // Step 3: Calculate
        totalTip = (totalBill * tipPercentage) / 100;
        totalBillWithTip = totalBill + totalTip;
        tipPerPerson = totalTip / numPeople;
        totalPerPerson = totalBillWithTip / numPeople;

        // Step 4: Display Output
        System.out.printf("Total tip amount: $%.2f%n", totalTip);
        System.out.printf("Total bill including tip: $%.2f%n", totalBillWithTip);
        System.out.printf("Tip per person: $%.2f%n", tipPerPerson);
        System.out.printf("Total per person: $%.2f%n", totalPerPerson);

        // Close the scanner
        scanner.close();
    }
}
