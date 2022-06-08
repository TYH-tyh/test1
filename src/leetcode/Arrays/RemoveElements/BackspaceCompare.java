package leetcode.Arrays.RemoveElements;

/**
 * @Author 田义会
 * @Date 2022-06-08 11:04
 * @Description leetcode  844.比较含退格的字符串
 */
public class BackspaceCompare {
    public static void main(String[] args) {
        String s = "y#fo##f";
        String t = "y#f#o##f";
        System.out.println(removeBackspace(t));
        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        return removeBackspace(s).equals(removeBackspace(t)) ? true : false;
    }


    public static String removeBackspace(String S) {
        char[] s = S.toCharArray();
        int top = -1;
        for (int i = 0; i < S.length(); i++) {
            if (s[i] != '#') {
                s[++top] = s[i];
            } else {
                if (top > -1) {
                    top--;
                }
            }
        }
        return String.valueOf(s, 0, top + 1);
    }
}
