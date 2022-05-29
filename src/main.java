import leetcode.MyLinkListOfMine;

/**
 * @auther 田义会
 * @date 2022/4/25 19:40
 */
public class main {

    public static void main(String[] args) {
        MyLinkListOfMine linkedList = new MyLinkListOfMine();
        linkedList.addAtHead(5);
        linkedList.addAtIndex(1, 2);
        System.out.println(linkedList.get(1));
        linkedList.addAtHead(6);
        linkedList.addAtTail(2);
        System.out.println(linkedList.get(3));
        linkedList.addAtTail(1);
        System.out.println(linkedList.get(5));
        linkedList.addAtHead(2);
        System.out.println(linkedList.get(2));
        linkedList.addAtHead(6);



    }


}
