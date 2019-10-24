package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        DeleteDuplicated D = new DeleteDuplicated();
//        LinkedList<ListNode> l = new LinkedList<>();
//        ListNode l1 = new ListNode(1);
//        ListNode l2 = new ListNode(2);
//        ListNode l3 = new ListNode(3);
//        ListNode l4 = new ListNode(4);
//        ListNode l5 = new ListNode(5);
//        l1.next = l2;
//        l2.next = l3;
//        l3.next = l4;
//        l4.next = l5;
//        ReverseList r = new ReverseList();
//        ListNode res = r.reverseBetween(l1,1,4);
//        System.out.println("Res");
//        while(res.next!=null)
//        {
//            System.out.println(res.val);
//            res = res.next;
//        }
//        System.out.println(res.val);
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
//        l5.next = l2;
        DetectCycle d = new DetectCycle();
        ListNode res = d.detectCycle(l1);
        if(res == null){
            System.out.println(-1);
        }
        else{
            System.out.println(res.val);
        }


    }
}
