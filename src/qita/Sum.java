package qita;

/**
 * @auther 田义会
 * @date 2022/2/14 15:10
 * @description 求1~n的和 递归
 */
public class Sum {
    public static void main(String[] args) {
        int result = Sum.sumMethod(5);
        System.out.println(result);

    }

    public static int sumMethod(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumMethod(n - 1);
        }
    }
}
