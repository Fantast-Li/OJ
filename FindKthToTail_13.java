package 剑指offer;
//输入一个链表，输出该链表中倒数第k个结点。
//示例1
//输入
//1,{1,2,3,4,5}
//返回值
//{5}
public class FindKthToTail_13 {
    public static ListNode findKthToTail(ListNode head,int k) {
     // 不能逆转链表来做
        if (k <= 0 || head==null) {
            return null;
        }
        //先遍历链表求出 求出链表的长度
        int count = 0 ; // 记录链表元素的多少
        ListNode cur = head ;
        while (cur!=null) {
            count++;
            cur = cur.next;
        }
        if (k>count){
            return null;
        }
        // 倒数第k个节点就是第count -k 个节点
        for (int i = 0; i < count-k; i++) {
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(5) ;
        ListNode  listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(1);
        listNode.next=listNode1;
        listNode1.next= listNode2;
        System.out.println(FindKthToTail_13.findKthToTail(listNode, 2).val);
    }
}
