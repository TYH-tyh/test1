package qita;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther 田义会
 * @date 2022/4/27 14:48
 * @description leetcode
 */
public class EachIndexOfChar {
    public static List<Integer> eachIndexOfChar(String s, char ch) {
        List<Integer> res = new ArrayList<>();
        int index = s.indexOf(ch);
        while (index != -1) {
            res.add(index);
            index++;
            index = s.indexOf(ch, index + 1);
        }
        return res;
    }
}
