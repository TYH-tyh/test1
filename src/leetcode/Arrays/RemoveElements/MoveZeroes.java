package leetcode.Arrays.RemoveElements;

/**
 * @Author 田义会
 * @Date 2022-06-08 10:17
 * @Description leetcode
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(nums);
    }

    /**
     * @param nums
     * @return void
     * @description 不符合题意，改变了顺序
     */
    public static void moveZeroes1(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] == 0) {
                nums[left] = nums[right];
                nums[right] = 0;
                right--;
            } else {
                left++;
            }
        }
    }

    /**
     * @param nums
     * @return void
     * @description 将不等于0的元素从左到右赋值，最后将剩余元素全赋值为0
     */
    public static void moveZeroes2(int[] nums) {
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }
        }
        for (int i = left + 1; i < n; i++) {
            nums[i] = 0;
        }
    }

    /**
     * @param nums
     * @return void
     * @description 没遇到一个非0元素，就将其与它左边的第一个0元素交换位置
     */
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            //当前元素!=0，就把其交换到左边，等于0的交换到右边
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }
    }
}
