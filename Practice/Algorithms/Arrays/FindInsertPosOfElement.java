package Practice.Algorithms.Arrays;

public class FindInsertPosOfElement {
    public static int searchInsert(int[] nums, int target) {
        int pos = 0;
        while(pos <  nums.length) {
            if(nums[pos] >= target) {
                return pos;
            }
            pos++;
        }
        return pos;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        System.out.println(searchInsert(arr, 5));
        System.out.println(searchInsert(arr, 2));
        System.out.println(searchInsert(arr, 7));
        System.out.println(searchInsert(arr, 0));
    }
}
