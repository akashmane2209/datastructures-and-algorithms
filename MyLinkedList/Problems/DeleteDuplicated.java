package com.company;

import java.util.LinkedList;

public class DeleteDuplicated {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode temp = A;
        ListNode prev = A;
        if(A.next == null)
        {
            return A;
        }
        if(temp != null){
            while(temp.next != null)
            {
                if(temp.val == temp.next.val)
                {
                    while (temp.next!=null && temp.val == temp.next.val )
                    {
                        temp = temp.next;
                    }
                    if(temp.next == null){
                        if(temp.val == prev.val){
                            return null;
                        }
                        prev.next = null;
                        continue;
                    }
                    if(temp.val == prev.val){
                        temp = temp.next;
                        prev = temp;
                        A = prev;
                        continue;
                    }
                    if(prev.val == temp.val){
                        prev = temp = temp.next;
                        continue;
                    }
                    else{
                        prev.next = temp.next;
                        temp = prev.next;
                        continue;
                    }
                    //   System.out.println("Prev: "+prev.val);
                    //   System.out.println("Temp:"+temp.val);

                }
                else{
                    prev = temp;
                    temp = temp.next;
                }

            }
        }

        else{
            return null;
        }
        return A;


    }
}
