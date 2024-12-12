package lab4;

public class task2 {
    public void execute() {
        int[] array1 = {1, -20, 3, -4, 5};
        int[] array2 = {0, -100, 2, -3};
        int[] array3 = {-5};

        System.out.println("Task 2");
        System.out.println("Max absolute index: " + findMaxAbsoluteIndex(array1)); // 1
        System.out.println("Max absolute index: " + findMaxAbsoluteIndex(array2)); // 1
        System.out.println("Max absolute index: " + findMaxAbsoluteIndex(array3)); // 0

        try {
            findMaxAbsoluteIndex(new int[]{});
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findMaxAbsoluteIndex(int[] array) {
        if (array == null) {
            throw new NullPointerException("Array cannot be null");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int maxIndex = 0;
        int maxAbsValue = Math.abs(array[0]);

        for (int i = 1; i < array.length; i++) {
            int absValue = Math.abs(array[i]);
            if (absValue > maxAbsValue) {
                maxAbsValue = absValue;
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}

