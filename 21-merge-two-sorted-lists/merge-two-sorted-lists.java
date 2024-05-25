/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res=new ListNode(0);
        ListNode head=res;
        while(list1!=null && list2!=null){
            if (list1.val<list2.val){
                head.next=list1;
                list1=list1.next;
            }
            else{
                head.next=list2;
                list2=list2.next;
            }
            head=head.next;
        }
        while(list1!=null){
            head.next=list1;
            list1=list1.next;
            head=head.next;
        }
        while(list2!=null){
            head.next=list2;
            list2=list2.next;
            head=head.next;
        }
        return res.next;
    }
}