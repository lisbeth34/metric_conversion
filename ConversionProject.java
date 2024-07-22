
package conversion_unit;


import java.util.Scanner;

public class ConversionProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the unit you want to convert from:");
        String fromUnit = scanner.nextLine();

        System.out.println("Enter the unit you want to convert to:");
        String toUnit = scanner.nextLine();

        System.out.println("Enter the quantity to be converted:");
        double quantity = scanner.nextDouble();

        double result = 0.0;

        if (fromUnit.equalsIgnoreCase("Feet") && toUnit.equalsIgnoreCase("Meters")) {
            result = feetToMeters(quantity);
        } else if (fromUnit.equalsIgnoreCase("Pounds") && toUnit.equalsIgnoreCase("Kgs")) {
            result = poundsToKgs(quantity);
        } else if (fromUnit.equalsIgnoreCase("Fahrenheit") && toUnit.equalsIgnoreCase("Celsius")) {
            result = fahrenheitToCelsius(quantity);
        } else {
            System.out.println("Invalid conversion. Please try again.");
            return;
        }

        System.out.println("The result of the conversion is: " + result);
    }

    private static double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    private static double poundsToKgs(double pounds) {
        return pounds * 0.453592;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0/9.0;
    }
}