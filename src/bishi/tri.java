package bishi;

/**
 * @auther 田义会
 * @date 2022/4/12 17:20
 */
public class tri {
    public static void main(String[] args) {
        int[][] x = new int[4][4];
        int i, j;
        int n = 0;
        for (j = 0; j < 4; j++) {
            for (i = 3; i >= j; i--) {
                n++;
                x[i][j] = n;

            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(x[i][j] + " ");
                if (j == i) {
                    System.out.print("\n");
                }
            }
        }

    }
}
