package leetcode;

/**
 * @Description leetcode 1047、删除字符串中所有相邻重复项
 * @Author 田义会
 * @Date 2022-05-26 15:43
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "abbaca";//aacac
        //StringBuffer sb = new StringBuffer(new String(s));
        //System.out.println(sb.deleteCharAt(1));
        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.length() <= 1) return sb.toString();
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                i = i - 2 < 0 ? -1 : i - 2;

            }
        }
        return sb.toString();
    }

    public static String removeDuplicates1(String s) {
        char[] S = s.toCharArray();
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            if (top == -1 || S[top] != S[i]) {
                S[++top] = S[i];
            } else {
                top--;
            }
        }
        return String.valueOf(S, 0, top + 1);
    }
}
