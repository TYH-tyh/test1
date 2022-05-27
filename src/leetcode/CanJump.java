package leetcode;

/**
 * @Description leetcode 55、跳跃游戏
 * @Author 田义会
 * @Date 2022-05-26 10:41
 */
public class CanJump {
    public static void main(String[] args) {
        int[] nums = {2, 3, 0, 1, 1, 4};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int maxlen = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i <= maxlen) {
                if (maxlen >= nums.length - 1) return true;
                maxlen = Math.max(nums[i] + i, maxlen);
            }
        }
        return false;
    }
}
