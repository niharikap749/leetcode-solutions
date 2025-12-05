
 //Definition for singly-linked list.
 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
// 1. Recursive approach
class Solution1 {
    public ListNode mergeTwoListsHelper(ListNode list1, ListNode list2, ListNode list3) {
        ListNode curr = list3;
        if(list1==null && list2==null) return null;
        if(list1==null) return list2;
        if(list2==null) return list1;
        while(list1!=null && list2!=null) {
            if(list1.val<=list2.val) {
                list3.next = list1;
                list1 = list1.next;
            }
            else {
                list3.next = list2;
                list2 = list2.next;
            }
            list3 = list3.next;
        }
        if(list1!=null) {
            list3.next = list1;
        }else {
            list3.next = list2;
        }
        return curr.next;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode(0);
        return mergeTwoListsHelper(list1,list2,list3);
    }
}

// 2. Iterative approach
class Solution2 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null) return null;
        if(list1==null) return list2;
        else if(list2==null) return list1;
        ListNode list3 = new ListNode(0);
        ListNode curr = list3;
        while(list1!=null && list2!=null) {
            if(list1.val<=list2.val) {
                list3.next = list1;
                list1 = list1.next;
            }
            else {
                list3.next = list2;
                list2 = list2.next;
            }
            list3 = list3.next;
        }
        if(list1!=null) list3.next = list1;
        else list3.next = list2;
        return curr.next;
    }
}