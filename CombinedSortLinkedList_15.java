package 剑指offer;
//题目描述
//输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
//示例1
//输入
//复制
//{1,3,5},{2,4,6}
//返回值
//复制
//{1,2,3,4,5,6}
//思路 :

public class CombinedSortLinkedList_15 {
    // 使用新链表
    public ListNode Merge(ListNode list1,ListNode list2) {
      if (list1==null) {
          return  list2;
      }
      if (list2 == null) {
          return list1;
      }
      ListNode newList = new ListNode(-1);
      ListNode cur = newList;
      while (list1!=null && list2!=null) {
          if (list1.val > list2.val) {
            cur.next =list2;
            list2 = list2.next;
          } else {
              cur.next = list1 ;
              list1 = list1.next;
          }
          cur =cur.next;
      }
      if (list1!=null) {
          cur.next = list1;
          list1 = list1.next;
      }
      if (list2!=null) {
          cur.next = list2;
          list2 = list2.next;
      }
      return newList.next;
    }
    // 在原代码上添加
    public ListNode Merge1(ListNode list1,ListNode list2){
        // 往list1 中添加 元素
        if (list1==null && list2==null) {
            return null ;
        }
        if (list1==null) {
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        ListNode list = null ; //返回的节点 需要给list最小的值
        if (list1.val>=list2.val){

        }
        return list2;
        
    }

    public static void main(String[] args) {

    }

}
