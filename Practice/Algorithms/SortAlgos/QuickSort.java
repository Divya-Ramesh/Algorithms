package Practice.Algorithms.SortAlgos;

public class QuickSort {
    public static int partition(int[] arr, int l, int r) {
        int pivot = arr[l];
        int i = l+1;
        while (i <= r) {
            while (i <= r && arr[i] <= pivot) i++;
            while (i <= r && arr[r] > pivot) r--;
            if (i < r) {
                int temp = arr[i];
                arr[i] = arr[r];
                arr[r] = temp;
            }
        }
        int temp = arr[r];
        arr[r] = arr[l];
        arr[l] = temp;
        return r;
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int pos = partition(arr, l, r);
            quickSort(arr, l, pos-1);
            quickSort(arr, pos+1, r);
        }
    }

    private static void printArray(int[] arr) {
        for (int value : arr)
            System.out.print(value + ", ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 36, 10, 16, 8, 12, 15, 6, 3, 9, 5, 9, 9};
        System.out.println("Before sort");
        printArray(arr);
        quickSort(arr, 0, arr.length-1);
        System.out.println("After sort");
        printArray(arr);
    }
}
