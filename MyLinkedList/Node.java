package com.company;

public class Node {
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    Node(){
        this.next = null;
        this.prev = null;
    }

}
