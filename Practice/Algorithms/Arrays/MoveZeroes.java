package Practice.Algorithms.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            while (i < nums.length-1 && nums[i] != 0) {
                i++;
            }
            if (i == nums.length-1) break;
            j = i+1;
            while (j < nums.length-1 && nums[j] == 0) {
                j++;
            }
            nums[i++] = nums[j];
            nums[j] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 9, 0, 12, 3};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
