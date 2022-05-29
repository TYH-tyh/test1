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
        Node1 newNode = new Node1(val);
        //考虑链表为空的情况
        if (size == 0) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addAtTail(int val) {
        //考虑链表为空的情况
        if (size == 0) {
            head.val = val;
        } else {
            Node1 node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node1(val);
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            this.addAtHead(val);
        } else if (index == this.size) {
            this.addAtTail(val);
        } else if (index < this.size) {
            Node1 node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            Node1 temp = node.next;
            node.next = new Node1(val);
            node.next.next = temp;
            size++;
        }

    }

    public void deleteAtIndex(int index) {
        //删除头结点并且该节点不是链表唯一节点
        if (size == 1 && index == 0) {
            head.val = 0;
            //删除头结点但是该节点不是链表唯一节点
        } else if (index == 0 && index < size) {
            head = head.next;
        } else if (index > 0 && index < size) {
            Node1 node = head;
            for (int i = 0; i < index-1; i++) {
                node = node.next;
            }
            //需要考虑node.next为null的情况
            node.next = node.next.next;
        } else {
            return;
        }
        size--;
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
