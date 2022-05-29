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
        //如果stack不为空的话，将stack中的元素全部添加到top中，直到stack为空；此时x始终是top里的第一个元素，
        while (!stack.isEmpty()) {
            top.offer(stack.poll());
        }
        //stack始终为空
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
