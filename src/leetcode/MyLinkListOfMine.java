package leetcode;

/**
 * @Author 田义会
 * @Date 2022-05-27 16:14
 * @Description leetcode 707、设计链表
 */
public class MyLinkListOfMine {

    Node1 head;
    int size;

    public MyLinkListOfMine() {
        head = new Node1();
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node1 node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.val;
    }

    public void addAtHead(int val) {
        Node1 target = new Node1(val);
        if (size == 0) {
            head = target;
        } else {
            target.next = head;
            head = target;
        }
        size++;
    }

    public void addAtTail(int val) {
        Node1 node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node1(val);
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            this.addAtHead(val);
        } else if (index == this.size) {
            this.addAtTail(val);
        } else {
            Node1 node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            Node1 temp = new Node1();
            temp = node.next;
            node.next = new Node1(val);
            node.next.next = temp;
        }
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= 0 && index < this.size) {
            Node1 node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            Node1 temp = new Node1();
            temp = node.next.next;
            node.next = temp;
            size--;
        }

    }
}

class Node1 {
    int val;
    Node1 next;

    Node1() {

    }

    Node1(int val) {
        this.val = val;
    }

    Node1(int val, Node1 next) {
        this.val = val;
        this.next = next;
    }
}
