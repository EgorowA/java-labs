package lab3;

public class task3 {
    public void execute() {
        try {
            System.out.println("Task 3");
            System.out.println(calculateInfiniteSum(0.01));
            System.out.println(calculateInfiniteSum(0.001));
            System.out.println(calculateInfiniteSum(-0.1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double calculateInfiniteSum(double epsilon) {
        if (epsilon <= 0) {
            throw new IllegalArgumentException("Invalid parameter. Ensure: epsilon > 0.");
        }
        double sum = 0;
        double term;
        int i = 0;
        do {
            term = Math.pow(-2, i) / (factorial(i) * (i + 1));
            sum += term;
            i++;
        } while (Math.abs(term) >= epsilon);
        return sum;
    }

    private static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial is not defined for negative integers.");
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

