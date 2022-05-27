package leetcode;

/**
 * @Description leetcode 1047、删除字符串中所有相邻重复项
 * @Author 田义会
 * @Date 2022-05-26 15:43
 */
public class RemoveDuplicates {
    public static String removeDuplicates(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                s = s.substring(0, i) + s.substring(i + 2);
                System.out.println(s);
            }
        }
        return s;
    }
}
