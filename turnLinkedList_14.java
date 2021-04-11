package 剑指offer;

public class turnLinkedList_14 {
//    题目描述
//    输入一个链表，反转链表后，输出新链表的表头。
//    示例1
//            输入
//    复制
//    {1,2,3}
//    返回值
//            复制
//    {3,2,1}
public ListNode ReverseList(ListNode head) {
    if (head==null) {
        return null;
    }
    ListNode cur = head.next ;
    ListNode pre = head ;
    ListNode temp = null ;
    while (cur != null) {
        temp = cur.next ;
        cur.next = pre ;
        pre = cur;
        cur = temp;
    }
    head.next= null; // 防止链表死循环
    return pre;
}
}
