package leetcode.Arrays.sort;

import java.util.Arrays;

/**
 * @Author 田义会
 * @Date 2022-06-09 09:06
 * @Description leetcode
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {3, 44, 38, 5, 47, 15};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * @param nums
     * @return void
     * @description 优化版 带flag
     */
    public static void bubbleSort(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < len - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j);
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }

    public static void swap(int[] nums, int j) {
        int temp = nums[j];
        nums[j] = nums[j + 1];
        nums[j + 1] = temp;
    }
}
