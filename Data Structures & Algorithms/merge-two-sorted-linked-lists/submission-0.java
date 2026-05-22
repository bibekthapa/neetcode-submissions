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
        List<Integer> arrList = new ArrayList<>();

        if(list1 == null) return list2;
        if(list2 == null) return list1;

    while(list1 != null && list2 != null){
        if(list1.val < list2.val){
            arrList.add(list1.val);
            list1 = list1.next;
        }
        else if(list1.val > list2.val){
            arrList.add(list2.val);
            list2 = list2.next;
        }
        else{
            arrList.add(list1.val);
            arrList.add(list2.val);

            list1 = list1.next;
            list2 = list2.next;
        }
    }
        while(list1 != null){
            arrList.add(list1.val);
            list1 = list1.next;
        }

        while(list2 != null){
            arrList.add(list2.val);
            list2 = list2.next;
        }
    

    ListNode temp = new ListNode(arrList.get(0));
    ListNode head = temp;

    for(int i = 1 ; i < arrList.size() ; i++){
        temp.next = new ListNode(arrList.get(i));
        temp = temp.next;
    }

    return head;
        
    }
}