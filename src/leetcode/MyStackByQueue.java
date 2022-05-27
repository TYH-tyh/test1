package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author 田义会
 * @Date 2022-05-27 14:00
 * @Description leetcode 225、用队列实现栈
 */
public class MyStackByQueue {
    Queue<Integer> stack;
    Queue<Integer> top;


    public MyStackByQueue() {
        stack = new LinkedList<>();
        top = new LinkedList<>();
    }

    public void push(int x) {
        top.offer(x);
        while (!stack.isEmpty()) {
            top.offer(stack.poll());
        }
        Queue<Integer> temp;
        temp = stack;
        stack = top;
        top = temp;

    }

    public int pop() {
        return stack.poll();
    }

    public int top() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
