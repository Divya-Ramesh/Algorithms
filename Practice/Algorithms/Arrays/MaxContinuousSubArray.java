package Practice.Algorithms.Arrays;

public class MaxContinuousSubArray {
    public static int maxSubArray(int[] nums) {
        int maxValue = nums[0];
        int maxSoFar = 0;
        for (int num : nums) {
            maxSoFar += num;
            if (maxValue < maxSoFar)
                maxValue = maxSoFar;
            if (maxSoFar < 0) maxSoFar = 0;
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(arr));
    }
}
