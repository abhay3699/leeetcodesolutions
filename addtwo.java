class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //three cases: simple add, with carryon bits, with overflow
        //using while loop to target the problem
        ListNode p1 = new ListNode ();
        ListNode curr = p1;
        int carry = 0;
        while (l1 != null || l2 != null){
            //check l1, l2 val
            int sum =0;
            if (l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            //check if it results carry bits
            if (sum  >= 10 ){
                sum = sum % 10;
                carry = 1;
            }
            else {
                carry =0;
            }
            //add the node to lists
            curr.next = new ListNode (sum);
            curr = curr.next;
        }
        //if result overflow, add a new node for extra carry bit
        if (carry == 1){
            curr.next = new ListNode (1);
        }
       return p1.next;
    }
}