package Practice.Algorithms.SortAlgos;

public class HeapSort {
    private static void createHeap(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            int parent = (int) Math.floor((i-1)/2);
            int pos = i;
            while (arr[parent] < arr[pos]) {
                int temp = arr[parent];
                arr[parent] = arr[pos];
                arr[pos] = temp;
                pos = parent;
                parent = (int) Math.floor((pos-1)/2);
            }
        }
    }

    private static void heapify(int[] arr) {
        int heapSize = arr.length - 1;
        while (heapSize > 0) {
            swap(arr, heapSize, 0);
            heapSize--;
            boolean posFound = false;
            int curr = 0;
            while (!posFound) {
                boolean swapped = false;
                int largest = curr;
                int left = 2*curr + 1;
                int right = 2*curr + 2;
                if (left < heapSize && arr[left] > arr[largest]) {
                    largest = left;
                }
                if (right < heapSize && arr[right] > arr[largest]) {
                    largest = right;
                }

                if (largest != curr) {
                    swap(arr, largest, curr);
                    curr = largest;
                    swapped = true;
                }
                if (!swapped) posFound = true;
            }
        }
    }

    public static void heapSort(int[] arr) {
        createHeap(arr);
        heapify(arr);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
        heapSort(arr);
        System.out.println("After sort");
        printArray(arr);
    }
}
