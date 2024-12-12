package lab4;

public class task1 {
    public void execute() {
        int[] array1 = {1, -2, 3, -4, 5};
        int[] array2 = {0, -1, -2, -3, 0};
        int[] array3 = {};

        System.out.println("Task 1");
        System.out.println("Count of negatives: " + countNegatives(array1));
        System.out.println("Count of negatives: " + countNegatives(array2));
        System.out.println("Count of negatives: " + countNegatives(array3));

        try {
            countNegatives(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int countNegatives(int[] array) {
        if (array == null) {
            throw new NullPointerException("Array cannot be null");
        }

        int count = 0;
        for (int value : array) {
            if (value < 0) {
                count++;
            }
        }
        return count;
    }
}


