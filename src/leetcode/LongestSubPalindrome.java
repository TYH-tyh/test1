package leetcode;

/**
 * @Description leetcode 5、最长回文子串
 * @Author 田义会
 * @Date 2022-05-25 14:20
 */
public class LongestSubPalindrome {
    public static void main(String[] args) {
        String s = "bbabad";
        System.out.println(longestSubPalindrome(s));
    }
    /**
     * @param s
     * @return java.lang.String
     * @description 获取最长回文子串
     */
    public static String longestSubPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        int maxLen = 1;
        int begin = 0;
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        for (int L = 2; L <= len; L++) {
            for (int i = 0; i < len; i++) {
                int j = L + i - 1;
                if (j >= len) {
                    break;
                }
                if (s.charAt(i) != s.charAt(j)) {
                    dp[i][j] = false;
                } else {
                    if (L <= 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j] && L > maxLen) {
                    maxLen = L;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }
}
