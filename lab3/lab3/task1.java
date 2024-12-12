package lab3;

public class task1 {
    public void execute() {
        try {
            System.out.println("Task 1");
            System.out.println(calculateSum(2, 4, 10));
            System.out.println(calculateSum(3, 5, 30));
            System.out.println(calculateSum(-1, 2, 5));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double calculateSum(double a, double b, int k) {
        if (k <= 0 || k > 30 || a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Invalid parameters. Ensure: k > 0 && k <= 30 && a > 0 && b > 0.");
        }
        double sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += Math.sqrt(a * i * Math.sqrt(b / i));
        }
        return sum;
    }
}

