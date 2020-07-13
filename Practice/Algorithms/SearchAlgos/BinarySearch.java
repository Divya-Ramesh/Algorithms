package Practice.Algorithms.SearchAlgos;

public class BinarySearch {
    public static int binarySearchSequential(int[] arr, int val) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (arr[mid] == val) return mid;
            else if (arr[mid] < val) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }

    public static int binarySearchRecursion(int[] arr, int low, int high, int val) {
        if (low <= high) {
            int mid = low + (high-low)/2;
            if (arr[mid] == val) return mid;
            else if (arr[mid] < val) return binarySearchRecursion(arr, mid+1, high, val);
            else return binarySearchRecursion(arr, low, mid-1, val);
        }
        return -1;
    }

    private static void printSolution(int pos, int val) {
        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element " + val + " is present at index " + pos);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        printSolution(binarySearchSequential(arr, 23), 23);
        arr = new int[]{2, 3, 4, 10, 40};
        printSolution(binarySearchRecursion(arr, 0, arr.length, 10), 10);
    }
}
