package leetcode;

/**
 * @Description leetcode 707、设计链表
 * @Author 田义会
 * @Date 2022-05-26 15:51
 */
public class MyLinkedList {

    Node head;
    int size;

    public MyLinkedList() {
        head = new Node();
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        Node node = head;
        /*for(;index > 0; index--) {
            node = node.next;
        }*/
        while (index > 0) {
            node = node.next;
            index--;
        }
        return node.val;
    }

    public void addAtHead(int val) {
        if (size == 0) head.val = val;
        else {
            Node newHead = new Node(val);
            newHead.next = head;
            head = newHead;
        }
        size++;

    }

    public void addAtTail(int val) {
        if (size == 0) {
            head.val = val;
        } else {
            Node tail = new Node(val);
            Node node = head;
            for (int i = size; i > 1; i--) {
                node = node.next;
            }
            node.next = tail;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index <= 0) {
            addAtHead(val);
        } else if (index < size) {
            Node indexNode = new Node(val);
            Node node = head;
            for (; index > 1; index--) {
                node = node.next;
            }
            Node tmp = node.next;
            node.next = indexNode;
            indexNode.next = tmp;
            size++;
        } else if (index == size) {
            addAtTail(val);
        }
    }

    public void deleteAtIndex(int index) {
        if (size == 1 && index == 0) {
            head.val = 0;
        } else if (index > 0 && index < size) {
            Node node = head;
            for (; index > 1; index--) {
                node = node.next;
            }
            node.next = node.next.next;
        } else if (index == 0 && index < size) {
            head = head.next;
        } else {
            return;
        }
        size--;

    }
}

class Node {
    int val;
    Node next;

    Node() {
    }

    Node(int val) {
        this.val = val;
    }

    Node(int val, int nextVal) {
        this.val = val;
        this.next = new Node(nextVal);
    }
}
