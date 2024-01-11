public class FibonacciSum {
    public static int sumEvenFibonacci(int limit) {
        int sum = 0;
        int a = 1;
        int b = 2;

        while (b <= limit) {
            if (b % 2 == 0) {
                sum += b;
            }

            int temp = b;
            b = a + b;
            a = temp;
        }

        return sum;
    }

    public static void main(String[] args) {
        int limit = 4000000;
        int result = sumEvenFibonacci(limit);
        System.out.println("Sum of even Fibonacci terms not exceeding " + limit + ": " + result);
    }
}
