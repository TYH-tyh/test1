package leetcode.Arrays.RemoveElements;

/**
 * @Author 田义会
 * @Date 2022-06-08 14:58
 * @Description leetcode  977.有序数组的平方
 */
public class SortedSquares {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 2, 3, 10};
        sortedSquares(nums);
    }

    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] res = new int[nums.length];
        int index = res.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                res[index] = nums[left] * nums[left];
                left++;
            } else {
                res[index] = nums[right] * nums[right];
                right--;
            }
            index--;
        }
        return res;
    }
}
