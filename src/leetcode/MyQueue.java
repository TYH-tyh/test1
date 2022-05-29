package leetcode;

import java.util.Stack;

/**
 * @Author 田义会
 * @Date 2022-05-27 15:41
 * @Description leetcode 232、用桟实现队列
 * @Solution 定义两个栈，
 */
public class MyQueue {

    Stack<Integer> queue;
    Stack<Integer> temp;

    public MyQueue() {
        queue = new Stack<>();
        temp = new Stack<>();
    }

    public void push(int x) {
        temp.push(x);
        tempToQueue();
    }

    public int pop() {
        tempToQueue();
        return queue.pop();
    }

    public int peek() {
        tempToQueue();
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty() && temp.isEmpty();
    }

    public void tempToQueue() {
        if (queue.isEmpty()) {
            while (!temp.isEmpty()) {
                queue.push(temp.pop());
            }
        }
    }
}
