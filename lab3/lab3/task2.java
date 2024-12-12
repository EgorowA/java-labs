package lab3;

public class task2 {
    public void execute() {
        try {
            System.out.println("Task 2");
            System.out.println(calculateFunction(10, 3));
            System.out.println(calculateFunction(5, 2));
            System.out.println(calculateFunction(0, 1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double calculateFunction(int t, int l) {
        if (t <= 0 || l <= 0) {
            throw new IllegalArgumentException("Invalid parameters. Ensure: t > 0 && l > 0.");
        }
        double sum = 0;
        for (int i = 1; i <= t; i++) {
            if (l % 2 == 1) {
                sum += Math.sqrt(t * l);
            } else {
                sum += l / Math.sqrt(t);
            }
        }
        return sum;
    }
}

