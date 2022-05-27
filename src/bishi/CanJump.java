package bishi;

/**
 * @auther 田义会
 * @date 2022/4/19 9:32
 */

/**
 * 1.如果某一个作为 起跳点 的格子可以跳跃的距离是 3，那么表示后面 3 个格子都可以作为 起跳点 ；
 * 2.可以对每一个能作为 起跳点 的格子都尝试跳一次，把 能跳到最远的距离 不断更新；
 * 3.如果可以一直跳到最后，就成功了。
 */

public class CanJump {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int rightmost = 0;
        for (int i = 0; i < len; ++i) {
            if (i <= rightmost) {
                rightmost = Math.max(rightmost, i + nums[i]);
                if (rightmost >= len - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}

