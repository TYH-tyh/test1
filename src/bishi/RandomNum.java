package bishi;

import java.util.Arrays;
import java.util.Random;

/**
 * @auther 田义会
 * @date 2022/4/19 8:48
 */
public class RandomNum {
    public static int[][] getRandomArray() {
        int[][] res = new int[100][10];
        Random r = new Random();
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = r.nextInt(2000) + 1;
            }
            Arrays.sort(res[i]);
        }
        return res;
    }

    //public static


}
