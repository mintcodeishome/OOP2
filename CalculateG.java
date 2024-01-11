public class CalculateG {
    public static double multi(double a, double b) {
        // Method for multiplication
        return a * b;
    }

    public static double square(double num) {
        // Method for powering to square
        return Math.pow(num, 2);
    }

    public static double sum(double a, double b) {
        // Method for summation
        return a + b;
    }

    public static void outline(double result) {
        // Method for printing out a result
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        // Compute the position and velocity of an object with defined methods and print out the result
        double gravity = -9.81;
        double fallingTime = 30;
        double initialVelocity = 0.0;
        double initialPosition = 0.0;

        double finalPosition = 0.5 * gravity * Math.pow(fallingTime, 2) + initialVelocity * fallingTime + initialPosition;
        double finalVelocity = gravity * fallingTime + initialVelocity;

        outline(finalPosition);
        outline(finalVelocity);
    }
}
