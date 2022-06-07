package leetcode.Arrays.BinarySearch;

/**
 * @Author 田义会
 * @Date 2022-06-02 15:32
 * @Description leetcode 704、二分查找
 */
public class Search {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] > target) {
                right = middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
