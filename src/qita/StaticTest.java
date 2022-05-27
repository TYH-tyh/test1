package qita;

/**
 * @auther 田义会
 * @date 2022/2/24 11:13
 */
public class StaticTest {
    static {
        System.out.println("1");
    }

    static {
        System.out.println("2");
    }

    static {
        System.out.println("3");
    }

    public static void main(String[] args) {
        System.out.println("测试!");
    }
}
