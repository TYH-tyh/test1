import leetcode.MyLinkListOfMine;

/**
 * @auther 田义会
 * @date 2022/4/25 19:40
 */
public class main {
    public static void main(String[] args) {
        MyLinkListOfMine linkedList = new MyLinkListOfMine();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1, 2);   //链表变为1-> 2-> 3
        System.out.println(linkedList.get(1));            //返回2
        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
        System.out.println(linkedList.get(1));


    }


}
