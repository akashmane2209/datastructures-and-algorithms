package com.company;

public class CircularQueueUsingLinkedList {
    Node HEAD = new Node();
    Node TAIL;
    void enque(int data)
    {
        if(HEAD.next == null)
        {
            Node n = new Node(data);
            n.next = n;
            HEAD.next = n;
            HEAD.data = 1;
            TAIL = n;
            return;
        }
        Node n = new Node(data);
        n.next = TAIL.next;
        TAIL.next = n;
        TAIL = n;
        HEAD.data++;
    }
    void deque()
    {
        if(HEAD.next == null)
        {
            System.out.println("Empty Queue");
            return;
        }
        Node delete = TAIL.next;
        TAIL.next = delete.next;
        HEAD.next = delete.next;
        HEAD.data--;
        if(HEAD.data == 0)
        {
            HEAD.next = null;
        }
        if(delete == TAIL)
        {
            TAIL = HEAD.next;
        }
        System.out.println("Dequed: "+delete.data);
    }
    void print(){
        Node temp = HEAD.next;
        if(temp == null)
        {
            System.out.println("Empty Linked List");
            return;
        }

        System.out.println("Elements Count: "+HEAD.data);
        int count = HEAD.data;
        while(count!=0)
        {
            System.out.println(temp.data +" ");
            temp = temp.next;
            count--;
        }
        System.out.println("-----------------------------------");
        System.out.println("Head: "+HEAD.next.data);
//        System.out.println("-----------------------------------");
        System.out.println("Tail: "+TAIL.data);
        System.out.println("-----------------------------------");

    }
}
