package top_interview_150;

public class MergeTwoSortedList {
	class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) {
	          val = x;
	          next = null;
	      }
	 }

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1==null)
        return list2;
        if(list2==null)
        return list1;

        ListNode merged=new ListNode(0);
        ListNode latest=merged;
       
        while(list1!=null && list2!=null){

            if(list1.val <= list2.val)
            {
                    latest.next = list1;
                    latest = latest.next;
                    list1 = list1.next;
            }
            else{
                    latest.next =list2;
                    latest = latest.next;
                    list2 = list2.next;
            }

        }
        latest.next = (list1!=null)?list1:list2;
        return merged.next;       
    }
	
}
