package leetcode;

/**
 * @Author 田义会
 * @Date 2022-05-26 18:41
 * @Description LeetCode 70、爬楼梯
 */
public class ClimbStairs {
    public static int climbStairs(int n) {
        int[] dp = new int[n];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
