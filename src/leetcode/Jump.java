package leetcode;

/**
 * @Author 田义会
 * @Date 2022-05-26 11:17
 * @Description leetcode 45、跳跃游戏 II
 */
public class Jump {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jump(nums));
    }
    /**
     * @param nums
     * @return int
     * @description
     */
    public static int jump(int[] nums) {
        int maxPosition = 0;
        int step = 0;
        int end = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxPosition = Math.max(nums[i] + i, maxPosition);
            if (i == end) {
                end = maxPosition;
                step++;
            }
        }

        return step;


    }
}

