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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head;
        }
        int size=0;
        ListNode cur=head;
        
        while(cur!=null){
            cur=cur.next;
            size++;
        }

        if(size==n){
            return head.next;
        }

        int indexToSearch=size-n;

        int i=1;
        ListNode prev=head;
        while(i<indexToSearch){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;

        return head;
    }
}