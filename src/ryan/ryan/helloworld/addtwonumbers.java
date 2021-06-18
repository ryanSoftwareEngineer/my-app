package ryan.ryan.helloworld;


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class addtwonumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode answer, temp;
        answer = temp = new ListNode(0);
        int remainder =0;
        while(l1 != null || l2 !=null){
            int top = l1 == null ? 0 : l1.val;
            int bot = l2 == null ? 0 : l2.val;
            int val = top + bot + remainder;
            remainder = val/10;
            temp.next = new ListNode(val % 10);
            temp = temp.next;
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
            if (remainder==1){
                temp.next = new ListNode(1);
            }
        }
        return answer.next;
    }
}
