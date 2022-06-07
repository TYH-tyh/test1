package leetcode.Arrays.BinarySearch;

/**
 * @Author 田义会
 * @Date 2022-06-07 10:43
 * @Description leetcode 69、x的平方根
 */
public class MySqrt {
    public static void main(String[] args) {
        int x = 0;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        int min = 0;
        int max = x;
        int ans = -1;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if ((long) mid * mid > x) {
                max = mid - 1;
            } else {
                ans = mid;
                min = mid + 1;
            }
        }
        return ans;

    }
}
