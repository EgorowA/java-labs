package lab5;

public class main {
    public static void main(String[] args) {
        float[] array = {3.2f, 1.5f, 4.8f, 2.9f, 0.1f};

        System.out.println("Початковий масив:");
        printArray(array);

        bubbleSortDescending(array);
        System.out.println("Після Bubble Sort:");
        printArray(array);

        float[] array2 = {3.2f, 1.5f, 4.8f, 2.9f, 0.1f};
        selectionSortDescending(array2);
        System.out.println("Після Selection Sort:");
        printArray(array2);
    }

    public static void printArray(float[] arr) {
        for (float num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    public static void bubbleSortDescending(float[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    float temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSortDescending(float[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            float temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
}
