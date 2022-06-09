package leetcode.Arrays.sort;

import java.util.Arrays;

/**
 * @auther 田义会
 * @date 2022/2/14 16:33
 * @Description leetcode  912.排序数组  插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] array = {1, 6, 3, 8, 3, 9, 34};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * @param nums
     * @return int[]
     * @description 可行但不推荐，超出时间限制了
     */
    public static int[] insertSort1(int[] nums) {
        if (nums.length > 0) {
            for (int index = 0; index < nums.length - 1; index++) {
                int current = nums[index + 1];
                while (index >= 0 && current < nums[index]) {
                    nums[index + 1] = nums[index];
                    index--;
                }
                nums[index + 1] = current;
            }
        }
        return nums;
    }

    /**
     * @param nums
     * @return int[]
     * @description 直接插入排序
     */
    public static int[] insertSort2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int index = 0;
            if (current < nums[i - 1]) {
                for (int j = i - 1; j >= 0; j--) {
                    if (current < nums[j]) {
                        nums[j + 1] = nums[j];
                    } else {
                        index = j + 1;
                        break;
                    }
                }
                nums[index] = current;
            }
        }
        return nums;
    }

    /**
     * @param nums
     * @return int[]
     * @description 折半查找插入排序
     */
    public static int[] insertSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int index = 0;
            if (current < nums[i - 1]) {
                index = findIndex(nums, i);
                for (int j = i - 1; j >= index; j--) {
                    nums[j + 1] = nums[j];
                }
                nums[index] = current;
            }
        }

        return nums;
    }

    public static int findIndex(int[] nums, int i) {
        int left = 0, right = i - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[i]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
