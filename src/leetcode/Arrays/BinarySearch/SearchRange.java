package leetcode.Arrays.BinarySearch;

/**
 * @Author 田义会
 * @Date 2022-06-06 16:22
 * @Description leetcode 34、在排序数组中查找元素的第一个和最后一个位置
 */
public class SearchRange {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(searchRange2(nums, target)[0]);
        System.out.println(searchRange2(nums, target)[1]);

    }

    /**
     * @param nums
     * @param target
     * @return int[]
     * @description 解法一
     */
    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int left = 0;
        int right = nums.length;
        int index = -1;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] > target) {
                right = middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                index = middle;
                break;
            }
        }
        if (index == -1) {
            res[0] = -1;
            res[1] = -1;
        } else {
            for (int i = index; i >= 0; i--) {
                if (nums[i] != target) {
                    break;
                } else {
                    res[0] = i;
                }
            }
            for (int i = index; i < nums.length; i++) {
                if (nums[i] != target) {
                    break;
                } else {
                    res[1] = i;
                }
            }
        }
        return res;
    }

    /**
     * @param nums
     * @param target
     * @return int[]
     * @description 解法二（官方）
     */
    public static int[] searchRange2(int[] nums, int target) {
        int leftIdx = binarySearch(nums, target, true);
        int rightIdx = binarySearch(nums, target, false) - 1;
        if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
            return new int[]{leftIdx, rightIdx};
        }
        return new int[]{-1, -1};
    }

    public static int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

}
