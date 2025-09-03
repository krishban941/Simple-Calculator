import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double usdToInr = 83.12;
        double eurToInr = 90.25;
        double inrToUsd = 1 / usdToInr;
        double inrToEur = 1 / eurToInr;
        double usdToEur = usdToInr / eurToInr;
        double eurToUsd = eurToInr / usdToInr;

        System.out.println("=== Currency Converter ===");
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        System.out.println("3. EUR to INR");
        System.out.println("4. INR to EUR");
        System.out.println("5. USD to EUR");
        System.out.println("6. EUR to USD");
        System.out.print("Choose conversion option: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        double convertedAmount = 0.0;

        switch (choice) {
            case 1:
                convertedAmount = amount * usdToInr;
                System.out.println(amount + " USD = " + convertedAmount + " INR");
                break;
            case 2:
                convertedAmount = amount * inrToUsd;
                System.out.println(amount + " INR = " + convertedAmount + " USD");
                break;
            case 3:
                convertedAmount = amount * eurToInr;
                System.out.println(amount + " EUR = " + convertedAmount + " INR");
                break;
            case 4:
                convertedAmount = amount * inrToEur;
                System.out.println(amount + " INR = " + convertedAmount + " EUR");
                break;
            case 5:
                convertedAmount = amount * usdToEur;
                System.out.println(amount + " USD = " + convertedAmount + " EUR");
                break;
            case 6:
                convertedAmount = amount * eurToUsd;
                System.out.println(amount + " EUR = " + convertedAmount + " USD");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}