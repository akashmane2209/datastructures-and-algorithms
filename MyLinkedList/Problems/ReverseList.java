package com.company;

import java.util.List;
import java.util.Stack;

public class ReverseList {
    public ListNode reverseBetween(ListNode A, int B, int C) {
        Stack<ListNode> stack = new Stack<>();
        int count = 1;
        ListNode start = A;
        ListNode prev = A;
        ListNode end;
        if(A.next == null)
        {
            return A;
        }
        while(count!=B)
        {
            prev = start;
            start = start.next;
            count++;
        }
//        System.out.println(count);
        end = start;
        while(count!=C)
        {
            end = end.next;
            count++;
        }
        System.out.println("Start: "+start.val+" End: "+end.val);
        ListNode last = end.next;
        ListNode temp = start;
        while(temp!=null && temp != end.next)
        {
            System.out.println(temp.val);
            stack.push(temp);
            temp = temp.next;
        }
//        System.out.println("Prev: "+prev.val);
//        ListNode lastRemoved;
        if( B == 1){
            A = stack.pop();
            prev = A;
        }
        while(!stack.isEmpty())
        {
            ListNode rev = stack.pop();
            if(rev == A){
                continue;
            }

            else{
                prev.next = rev;
                System.out.println("Next:"+rev.val);
                System.out.println("Prev: "+prev.val);
                prev = prev.next;
                System.out.println("New Prev: "+prev.val);
            }


        }
//        System.out.println(last.val);


            prev.next = last;



        return A;
//        return null;
    }
}
