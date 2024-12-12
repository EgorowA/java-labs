package lab4;

public class task3 {
    public void execute() {
        int[] array1 = {1, -2, 3, 0, -4};
        int[] array2 = {0, 0, 0};
        int[] array3 = {-1, 1, -1};

        System.out.println("Task 3");
        System.out.println("Modified array: " + java.util.Arrays.toString(modifyArray(array1)));
        System.out.println("Modified array: " + java.util.Arrays.toString(modifyArray(array2)));
        System.out.println("Modified array: " + java.util.Arrays.toString(modifyArray(array3)));

        try {
            modifyArray(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int[] modifyArray(int[] array) {
        if (array == null) {
            throw new NullPointerException("Array cannot be null");
        }

        int[] modifiedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                modifiedArray[i] = array[i] * -1;
            } else if (array[i] > 0) {
                modifiedArray[i] = array[i] - 3;
            } else {
                modifiedArray[i] = -2;
            }
        }
        return modifiedArray;
    }
}
