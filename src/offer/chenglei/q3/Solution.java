package offer.chenglei.q3;



import java.util.ArrayList;


/**
 *    public class ListNode {
 *        int val;
 *        ListNode next = null;
 *
 *        ListNode(int val) {
 *            this.val = val;
 *        }
 *    }
 *
 */


/**
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (listNode != null) {
            if (listNode.next != null) {
                arrayList = printListFromTailToHead(listNode.next);
            }

            arrayList.add(listNode.val);
        }
        return arrayList;
    }
}



