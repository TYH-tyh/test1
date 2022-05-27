package leetcode;

/**
 * @Author 田义会
 * @Date 2022-05-26 15:55
 * @Description leetcode 409、最长回文串
 */
public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        /*int len = 0;
        int num = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.containsKey(s.charAt(i)) ? map.get(s.charAt(i)) + 1 : 1);
        }
        System.out.print(map);
        for (Character key : map.keySet()) {
            len += (map.get(key) / 2) * 2;
            if (map.get(key) % 2 != 0) {
                num = 1;
            }
        }
        return len + num;*/

        int[] count = new int[128];
        int length = s.length();
        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            count[c]++;
        }

        int ans = 0;
        for (int v : count) {
            ans += v / 2 * 2;
            if (v % 2 == 1 && ans % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
}
