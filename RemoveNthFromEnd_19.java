package 链表;

import 数组.RemoveDuplicates;

import java.util.Deque;
import java.util.LinkedList;

public class RemoveNthFromEnd_19 {
    public ListNode removeNthFromEnd(ListNode head ,int n ) {
    //计算链表的长度  L - n +1 为正数第几个
        ListNode cur = new ListNode(0,head);
        ListNode ans = cur;
        int length = getLength(head);
        //找到前驱节点
        for (int i = 0; i < length-n ; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return ans.next;
    }

    private int getLength(ListNode head) {
        int count = 0;
        while (head !=null) {
            count++;
            head = head.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd1(ListNode head ,int n ) {
        //使用栈
        ListNode cur = new ListNode(0,head);
        Deque<ListNode> deque = new LinkedList<>();
        ListNode ans = cur ;
        //将所有的节点放回到栈上
        while (cur!=null) {
            deque.push(cur);
            cur = cur.next;
        }
        //将第n 个删除
        for (int i = 0; i < n ; i++) {
            deque.poll();
        }
        ListNode pre = deque.peek();
        pre.next = pre.next.next;
        return ans.next;
    }


    public ListNode removeNthFromEnd2(ListNode head ,int n ) {
        //思路一： 双指针  最优解
         ListNode cur = new ListNode(0,head);
         ListNode fast = head ;
         ListNode slow = cur ;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast!=null) {
            fast=fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return cur.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        RemoveNthFromEnd_19 removeNthFromEnd_19 = new RemoveNthFromEnd_19();
        System.out.println(removeNthFromEnd_19.removeNthFromEnd(head, 2));

    }
}
