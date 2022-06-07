package leetcode.Arrays.RemoveElements;

/**
 * @Author 田义会
 * @Date 2022-06-07 14:37
 * @Description leetcode 27、移除元素
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {2, 3, 2, 3};

        System.out.println(removeElement(nums, 2));

    }

    /**
     * @param nums
     * @param val
     * @return int
     * @description 暴力破解法
     */
    public static int removeElement1(int[] nums, int val) {
        int len = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                len--;
                i--;
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("------------");
        return len;
    }

    /**
     * @param nums
     * @param val
     * @return int
     * @description 双指针法：不改变顺序
     */
    public static int removeElement2(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }

    /**
     * @param nums
     * @param val
     * @return int
     * @description 双指针法优化：可以改变顺序
     */
    public static int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right - 1];
                right--;
            } else {
                left++;
            }
        }
        return left;

    }

}
