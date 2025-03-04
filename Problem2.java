import java.util.*;
public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

public static void main(String[] args) {
        int[] nums2 = {3,2,1,5,6,4};
        int k = 2;
        System.out.println("Kth Largest Element: " + findKthLargest(nums2, k));
    }
}
