package Practice.Algorithms.Arrays;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int i =0;
        int j = height.length-1;
        int area = 0;
        while(i<j) {
            int areaCurr = Math.min(height[i], height[j]) * (j-i);
            if(areaCurr > area) {
                area = areaCurr;
            }
            if(height[i] < height[j]) {
                i++;
            }
            else {
                j--;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(arr));
    }
}
