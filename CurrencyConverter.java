import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount;
        String fromCurrency, toCurrency;

        System.out.println("Welcome to Currency Converter!");

        // Get the amount to convert
        System.out.print("Enter the amount to convert: ");
        amount = scanner.nextDouble();

        // Get the currency codes
        System.out.print("Enter the currency to convert from (e.g., USD, EUR, GBP): ");
        fromCurrency = scanner.next();

        System.out.print("Enter the currency to convert to (e.g., USD, EUR, GBP): ");
        toCurrency = scanner.next();

        // Call the conversion function
        double convertedAmount = convertCurrency(amount, fromCurrency, toCurrency);

        // Display the result
        System.out.println(amount + " " + fromCurrency + " = " + convertedAmount + " " + toCurrency);

        scanner.close();
    }

    public static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        // Here, you would typically have a conversion rate database or an API call to get the latest conversion rates
        // For simplicity, let's assume a few conversion rates
        double usdToEur = 0.85;
        double usdToGbp = 0.72;
        double eurToGbp = 0.85;

        // Perform the conversion
        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            return amount * usdToEur;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("GBP")) {
            return amount * usdToGbp;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            return amount / usdToEur;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("GBP")) {
            return amount * eurToGbp;
        } else if (fromCurrency.equals("GBP") && toCurrency.equals("USD")) {
            return amount / usdToGbp;
        } else if (fromCurrency.equals("GBP") && toCurrency.equals("EUR")) {
            return amount / eurToGbp;
        } else {
            // Invalid currency codes
            System.out.println("Invalid currency codes. Please try again.");
            return 0.0;
        }
    }
}