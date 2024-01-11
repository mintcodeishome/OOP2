public class Datatype {
    double a;
    double vi;
    double xi;

    public Datatype(double a, double vi, double xi) {
        this.a = a;
        this.vi = vi;
        this.xi = xi;
    }

    public double calculatePosition(double t) {
        return 0.5 * a * Math.pow(t, 2) + vi * t + xi;
    }

    public double calculateVelocity(double t) {
        return a * t + vi;
    }

    // New methods for multiplication, powering to square, and summation
    public double multiply(double x, double y) {
        return x * y;
    }

    public double powerToSquare(double x) {
        return Math.pow(x, 2);
    }

    public double sum(double x, double y) {
        return x + y;
    }

    // New method for printing out a result
    public void outline(double result) {
        System.out.println("The result is: " + result);
    }
}