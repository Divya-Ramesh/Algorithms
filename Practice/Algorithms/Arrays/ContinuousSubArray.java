package Practice.Algorithms.Arrays;

public class ContinuousSubArray {
    public static boolean findValidSubArray(int[] nums, int sum) {
        int startIndex = 0;
        int sumSoFar = 0;
        for (int i=0; i<nums.length;i++) {
            sumSoFar += nums[i];
            if (sumSoFar == sum) {
                System.out.println("Sum found between indexes " + startIndex + " and " + i);
                return true;
            } else if(sumSoFar > sum && startIndex<i) {
                while(sumSoFar > sum) {
                    sumSoFar -= nums[startIndex++];
                }
            }
        }
        System.out.println("No subarray found");
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int sum = 23;
        findValidSubArray(arr, sum);
    }
}
