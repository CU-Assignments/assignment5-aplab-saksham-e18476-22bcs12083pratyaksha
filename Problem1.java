import java.util.*;

public class SortingProblems {
    
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

public static void main(String[] args) {
        // Testing Sort Colors
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println("Sorted Colors: " + Arrays.toString(nums));
