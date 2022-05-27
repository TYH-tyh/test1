package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 田义会
 * @Date 2022-05-27 14:00
 * @Description leetcode 225、用队列实现栈
 */
public class MyStackByArrayList {
    List<Integer> stack;

    public MyStackByArrayList() {
        stack = new ArrayList<>();
    }

    public void push(int x) {
        stack.add(x);

    }

    public int pop() {
        return stack.remove(stack.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
