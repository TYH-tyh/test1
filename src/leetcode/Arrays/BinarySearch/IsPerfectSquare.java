package leetcode.Arrays.BinarySearch;

/**
 * @Author 田义会
 * @Date 2022-06-07 14:07
 * @Description leetcode 367、有效的完全平方数
 */
public class IsPerfectSquare {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {
        int left = 0, right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid < num) {
                left = mid + 1;
            } else if ((long) mid * mid > num) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

}
