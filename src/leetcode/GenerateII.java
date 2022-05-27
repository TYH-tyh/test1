package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 田义会
 * @Date 2022-05-26 18:50
 * @Description leetcode 119、杨辉三角II
 */
public class GenerateII {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }

            }
            res.add(row);

        }
        return res.get(rowIndex);
    }
}
