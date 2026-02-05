package Java.Level_2;
import java.util.*;
public class UnitConverter3 {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kg = 0.453592;
        return pounds * pounds2kg;
    }
    public static double convertKilogramsToPounds(double kg) {
        double kg2pounds = 2.20462;
        return kg * kg2pounds;
    }
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        System.out.println("Celsius: " + convertFahrenheitToCelsius(f));
        double c = sc.nextDouble();
        System.out.println("Fahrenheit: " + convertCelsiusToFahrenheit(c));
        double pounds = sc.nextDouble();
        System.out.println("Kilograms: " + convertPoundsToKilograms(pounds));
        double kg = sc.nextDouble();
        System.out.println("Pounds: " + convertKilogramsToPounds(kg));
        double gallons = sc.nextDouble();
        System.out.println("Liters: " + convertGallonsToLiters(gallons));
        double liters = sc.nextDouble();
        System.out.println("Gallons: " + convertLitersToGallons(liters));
        sc.close();
    }
}
