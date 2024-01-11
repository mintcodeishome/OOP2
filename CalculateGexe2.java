public class CalculateGexe2{

    // Method for multiplication
    public static double multiply(double x, double y) {
        return x * y;
    }

    // Method for powering to square
    public static double powerToSquare(double x) {
        return Math.pow(x, 2);
    }

    // Method for summation
    public static double sum(double x, double y) {
        return x + y;
    }

    // Method for printing out a result
    public static void outline(double result) {
        System.out.println("The result is: " + result);
    }

    public static void main(String[] args) {
        // Create an instance of the Datatype class with initial values
        Datatype datatype = new Datatype(-9.81, 0.0, 0.0);

        // Set the falling time
        int fallingTime = 30;

        // Calculate position and velocity using the Datatype class
        double finalPosition = datatype.calculatePosition(fallingTime);
        double finalVelocity = datatype.calculateVelocity(fallingTime);

        // Use the new methods for multiplication, powering to square, and summation
        double multiplicationResult = multiply(finalPosition, finalVelocity);
        double squareResult = powerToSquare(finalVelocity);
        double summationResult = sum(multiplicationResult, squareResult);

        // Print out the results
        outline(multiplicationResult);
        outline(squareResult);
        outline(summationResult);
    }
}
