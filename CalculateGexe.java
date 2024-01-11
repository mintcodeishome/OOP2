public class CalculateGexe {
    public static void main(String[] args) {
        // Create an instance of the Datatype class with initial values
        Datatype datatype = new Datatype(-9.81, 0.0, 0.0);

        // Set the falling time
        int fallingTime = 30;

        // Calculate position and velocity using the Datatype class
        double finalPosition = datatype.calculatePosition(fallingTime);
        double finalVelocity = datatype.calculateVelocity(fallingTime);

        // Use the new methods for multiplication, powering to square, and summation
        double multiplicationResult = datatype.multiply(finalPosition, finalVelocity);
        double squareResult = datatype.powerToSquare(finalVelocity);
        double summationResult = datatype.sum(multiplicationResult, squareResult);

        // Print out the results
        datatype.outline(multiplicationResult);
        datatype.outline(squareResult);
        datatype.outline(summationResult);
    }
}
