package Practice.Algorithms.SearchAlgos;

public class LinearSearch {
    public static int linearSearch(int[] arr, int val) {
        for(int i=0; i<arr.length;i++) {
            if (arr[i] == val) return i;
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
        printSolution(linearSearch(arr, 23), 23);
        arr = new int[]{2, 3, 4, 10, 40};
        printSolution(linearSearch(arr, 0), 0);
    }
}
