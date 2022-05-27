package leetcode;

/**
 * @auther 田义会
 * @date 2021/9/23 14:08
 * @description
 */
public class isPowerOfThree {
    public static void main(String[] args) {
        boolean t = isPowerOfThree(27);
        System.out.println(t);
    }

    static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        } else {
            int re = n / 3;
            while (re != 1) {
                if (re % 3 != 0) {
                    return false;
                }
                re /= 3;
            }
            return true;
        }
    }
}
