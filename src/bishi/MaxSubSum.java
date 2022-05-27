package bishi;

/**
 * @auther 田义会
 * @date 2022/4/25 19:20
 */
public class MaxSubSum {
    public static int maxSubSum(int[] arrs) {
        //数组dp用于记录数组arrs当前索引位置最大的连续子序列和
        int[] dp = new int[arrs.length];
        dp[0] = arrs[0];
        int maxSum = dp[0];
        for (int i = 1; i < arrs.length; i++) {
            //如果当前索引位置前一位的最大子序列和dp[i-1]大于0,
            // 则无论arrs[i]大于0还是小于0,
            // 当前索引位置最大的连续子序列和一定是dp[i - 1] + arrs[i],反之和前面的相加一定只会更小，所以就只是arrs[i].
            dp[i] = dp[i - 1] > 0 ? dp[i - 1] + arrs[i] : arrs[i];
            maxSum = Math.max(maxSum, dp[i]);
        }

        return maxSum;

    }
}

