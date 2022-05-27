package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description leetcode 118、杨辉三角
 * @Author 田义会
 * @Date 2022-05-25 16:38
 */
public class Generate {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(j, 1);
                } else {
                    row.add(j, res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
            }
            res.add(row);
        }
        return res;
    }
}
