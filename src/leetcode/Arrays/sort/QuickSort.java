package leetcode.Arrays.sort;

import java.util.Arrays;

/**
 * @auther 田义会
 * @date 2022/4/19 14:52
 * @Description leetcode  912.排序数组  快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {49, 38, 65, 97, 76, 13, 27};//{27,38,65,97,12,13,49} {27,38,12,97,65,13,49} {27,38,12,13,65,97,49}
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] quickSort1(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end >= array.length || start > end) return null;
        int smallIndex = partition(array, start, end);
        if (smallIndex > start)
            quickSort(array, start, smallIndex - 1);
        if (smallIndex < end)
            quickSort(array, smallIndex + 1, end);
        return array;
    }

    /**
     * @param array
     * @param start
     * @param end
     * @return int
     * @description 分区：选取nums数组中随机元素作为基准
     */
    public static int partition1(int[] array, int start, int end) {
        int pivot = (int) (start + Math.random() * (end - start + 1));
        int smallIndex = start - 1;
        swap(array, pivot, end);
        for (int i = start; i <= end; i++)
            if (array[i] <= array[end]) {
                //smallIndex表示第一个大于基准的元素的下标
                smallIndex++;
                if (i > smallIndex)
                    swap(array, i, smallIndex);
            }
        return smallIndex;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] quickSort(int[] nums, int start, int end) {
        if (start < end) {
            int pivotpos = partition(nums, start, end);
            quickSort(nums, start, pivotpos - 1);
            quickSort(nums, pivotpos + 1, end);
        }
        return nums;
    }

    /**
     * @param nums
     * @param start
     * @param end
     * @return int
     * @description 分区：直接选取nums[start]作为基准
     */
    public static int partition2(int[] nums, int start, int end) {
        int pivot = nums[start];
        while (start < end) {
            while (nums[end] >= pivot && start < end) {
                end--;
            }
            nums[start] = nums[end];
            while (nums[start] <= pivot && start < end) {
                start++;
            }
            nums[end] = nums[start];
        }
        nums[start] = pivot;
        return start;
    }

    /**
     * @param nums
     * @param start
     * @param end
     * @return int
     * @description 分区：选取nums数组中随机元素作为基准
     */
    public static int partition(int[] nums, int start, int end) {
        int pivotIndex = (int) (start + Math.random() * (end - start + 1));
        swap(nums, pivotIndex, start);
        int pivot = nums[start];
        while (start < end) {
            while (nums[end] >= pivot && start < end) {
                end--;
            }
            nums[start] = nums[end];
            while (nums[start] <= pivot && start < end) {
                start++;
            }
            nums[end] = nums[start];
        }
        nums[start] = pivot;
        return start;
    }


}

