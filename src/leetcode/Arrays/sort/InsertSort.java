package leetcode.Arrays.sort;

import java.util.Arrays;

/**
 * @auther 田义会
 * @date 2022/2/14 16:33
 * @Description leetcode  912.排序数组  插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] array = {1, 6, 3, 8, 3, 9, 34};
        int[] result = InsertSort.InsertSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] InsertSort(int[] arry) {
        if (arry.length > 0) {
            for (int index = 0; index < arry.length - 1; index++) {
                int current = arry[index + 1];
                while (index >= 0 && current < arry[index]) {
                    arry[index + 1] = arry[index];
                    index--;
                }
                arry[index + 1] = current;
            }
        }
        return arry;
    }
}
