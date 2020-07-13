package Practice.Algorithms.SortAlgos;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i=0; i< arr.length-1; i++) {
            swapped = false;
            for (int j=0; j<arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    private static void printArray(int[] arr) {
        for (int value : arr)
            System.out.print(value + ", ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        System.out.println("Before sort");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("After sort");
        printArray(arr);
    }
}
