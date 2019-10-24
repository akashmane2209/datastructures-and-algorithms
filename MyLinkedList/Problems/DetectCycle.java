package com.company;

public class DetectCycle {
    public ListNode detectCycle(ListNode a) {
        ListNode T1 = a;
        ListNode T2 = a;
        if(a.next == null)
        {
            return a;
        }
//        System.out.println("T1: "+T1.val+" T2: "+T2.val);
//        System.out.println(T2.next.next == T1);
        while(T2.next.next != T1)
        {
            T2 = T2.next.next;
            T1 = T1.next;
            System.out.println("T1: "+T1.val+" T2: "+T2.val);
            System.out.println(T2.next);
            if(T2.next == null)
            {
                return null;
            }
        }
        return T2.next;

    }
}
