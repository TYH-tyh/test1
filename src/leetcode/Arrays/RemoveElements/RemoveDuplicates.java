package leetcode.Arrays.RemoveElements;

/**
 * @Author 田义会
 * @Date 2022-06-07 16:13
 * @Description leetcode 26.删除排序数组中的重复项
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicates(nums));
    }

    /**
     * @param nums
     * @return int
     * @description 双指针法 主要思路就是没找到一个与nums[left]不相同的数，就将其放在nums[left]后面
     */
    public static int removeDuplicates1(int[] nums) {
        int left = 0;
        if (nums.length == 1) return 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[left]) {
                left++;
                nums[left] = nums[i];
            }
        }
        return left + 1;
    }

    public static int removeDuplicates(int[] nums) {
        int t = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                //nums[t] = nums[i];
                //t=t+1;
                nums[t++] = nums[i];
            }
        }
        return t;
    }
}
