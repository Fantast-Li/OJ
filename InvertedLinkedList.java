package 剑指offer;

import java.util.ArrayList;
import java.util.Arrays;

//题目描述
//输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
//示例1
//输入
//复制
//{67,0,24,58}
//返回值
//复制
//[58,24,0,67]

class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}
// 思路 :1. 然后遍历那个要逆转的链表
//         使用Array的方法头插.

public class InvertedLinkedList {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode cur = listNode;
        ArrayList<Integer> array = new ArrayList<>();
        while (cur != null) {
            array.add(0,cur.val);
            cur = cur.next;
        }
        return array;
    }
    //思路2：先反转链表，然后在遍历反转链表，将内容添加到数组里
    public static ArrayList<Integer> printListFromTailToHead1(ListNode listNode){
        //反转链表
        ArrayList<Integer> array = new ArrayList<>();
        if (listNode == null){
            return array;
        }
        ListNode cur = listNode.next;
        ListNode newHead = listNode;
        ListNode temp = null ;
        while (cur!=null){
            temp = cur.next;
            cur.next = newHead;
            newHead = cur ;
            cur = temp;
        }
        listNode.next = null; // 将最后一个节点指向对象清为null  否则就会最后二个无限循环
        while (newHead!=null) {
            array.add(newHead.val);
            newHead =newHead.next;
        }
        return array;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(5) ;
        ListNode  listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(1);
        listNode.next=listNode1;
        listNode1.next= listNode2;
        ArrayList<Integer> integers = InvertedLinkedList.printListFromTailToHead1(listNode);
        System.out.println(integers);
    }
}