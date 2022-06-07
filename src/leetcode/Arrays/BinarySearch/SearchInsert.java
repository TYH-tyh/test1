package leetcode.Arrays.BinarySearch;

/**
 * @Author 田义会
 * @Date 2022-06-06 16:11
 * @Description leetcode 35、搜索插入位置
 */
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
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
        return left;
    }
}
