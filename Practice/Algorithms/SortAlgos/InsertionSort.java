package Practice.Algorithms.SortAlgos;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            int pos = i;
            for (int j=i-1; j>=0; j--) {
                if (arr[j] > arr[pos]) {
                    int temp = arr[pos];
                    arr[pos] = arr[j];
                    arr[j] = temp;
                    pos = j;
                }
            }
        }
    }

    private static void printArray(int[] arr) {
        for (int value : arr)
            System.out.print(value + ", ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 11, 4, 2, 8};
        System.out.println("Before sort");
        printArray(arr);
        insertionSort(arr);
        System.out.println("After sort");
        printArray(arr);
    }
}
