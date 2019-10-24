package com.company;

public class MergeTwoList {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode HEAD;
        ListNode prev = null;

        if(A.val < B.val && A.next!=null){
            HEAD = A;
            prev = HEAD;
            A = A.next;
        }
        else if(B.next!=null){
            HEAD = B;
            prev = HEAD;
            B = B.next;
        }
        else{
            if(A.val > B.val){
                HEAD = A;
            }
            else{
                HEAD = B;
            }
        }

        //  System.out.println(A.next+" "+B.next);
        //   System.out.println(HEAD.val);
        while(A.next != null && B.next != null)
        {
            // System.out.println("Current: "+A.val+" "+B.val);
            if(A.val < B.val){
                prev.next = A;
                prev = A;

                // System.out.println("Not null");
                ListNode temp = A.next;
                // System.out.println("Next: "+temp.val);

                //  System.out.println("Next: "+temp.val);
                //   System.out.println("Added: "+A.val);
                if(temp.val < A.val ){
                    A.next = B;
                }
                A = temp;



            }
            else if(A.val > B.val)
            {
                prev.next = B;
                prev = B;
                ListNode temp = B.next;

                //  System.out.println("Added: "+temp.val);
                if(temp.val < B.val){
                    B.next = A;
                }
                B = temp;

            }
            else if(A.val == B.val) {
                prev.next = A;
                ListNode temp = A.next;

                //  System.out.println("Previos: "+prev.val);
                A.next = B;
                prev = B;
                A = temp;
                B = B.next;
            }
            // System.out.println(A.next+" "+B.next);


        }
        // System.out.println(A.next+" "+B.next);
        if(A.next == null){
            if(B.next == null){
                A.next = B;
                return A;
            }
            if(A.val < B.val){
                prev.next = A;
                A.next = B;

            }
            else{
                while(A.val >= B.val && B.next!=null){
                    //   System.out.println(B.val+" "+A.val);
                    prev.next = B;
                    prev = B;
                    B = B.next;

                }
                if(B.next == null && A.val < B.val){
                    //   System.out.println("Last");
                    prev.next = A;
                    A.next = B;
                }
                else{
                    if(A.val < B.val){
                        prev.next = A;
                        A.next = B;
                    }
                    else{
                        prev.next = B;
                        B.next = A;
                    }

                }

            }


        }
        else if(B.next == null) {
            if(A.next == null){
                B.next = A;
                return B;
            }
            if(A.val > B.val){
                prev.next = B;
                B.next = A;

            }
            else{
                while(A.val <= B.val && A.next!=null){
                    prev.next = A;
                    prev = A;
                    A = A.next;
                    // System.out.println(B.val+" "+A.val);
                }
                if(A.next == null && A.val > B.val){
                    //   System.out.println("Last");
                    prev.next = B;
                    B.next = A;
                }
                else{
                    if(A.val > B.val){
                        prev.next = B;
                        B.next = A;
                    }
                    else{
                        prev.next = A;
                        A.next = B;
                    }

                }

            }

        }


        return HEAD;
    }
}
