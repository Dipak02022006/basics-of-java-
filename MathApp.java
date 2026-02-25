// Package Declaration
package MathOperations;

// MyMath Class
class MyMath {

    public static double floorValue(double num) {
        return Math.floor(num);
    }

    public static double ceilValue(double num) {
        return Math.ceil(num);
    }

    public static long roundValue(double num) {
        return Math.round(num);
    }
}

// Main Class
public class MathApp {
    public static void main(String[] args) {

        double num = 10.6;

        System.out.println("Original Number: " + num);
        System.out.println("Floor Value: " + MyMath.floorValue(num));
        System.out.println("Ceil Value: " + MyMath.ceilValue(num));
        System.out.println("Round Value: " + MyMath.roundValue(num));
    }
}
