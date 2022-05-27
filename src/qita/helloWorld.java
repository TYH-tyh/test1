package qita;

/**
 * @auther 田义会
 * @date 2022/2/9 17:23
 */
public class helloWorld {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k + "*" + i + "=" + i * k + "\t");
            }
            System.out.println("\n");
        }


    }
}
