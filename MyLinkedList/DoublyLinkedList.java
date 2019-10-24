package com.company;

import java.util.SortedMap;

public class DoublyLinkedList {
    Node HEADER =  new Node();
    Node FOOTER;
    void insertFirst(int data)
    {
        if(HEADER.next == null)
        {
            Node n = new Node(data);
            n.prev = n;
            n.next = n;
            HEADER.next = n;
            FOOTER = HEADER.next;
            HEADER.data = 1;
            return;
        }
        Node n = new Node(data);
        n.next = HEADER.next;
        n.prev = FOOTER;
        FOOTER.next = n;
        HEADER.next.prev = n;
        HEADER.next = n;
//        FOOTER = n;
        HEADER.data+=1;
    }
    void insertLast(int data)
    {
        if(HEADER.next == null)
        {
            this.insertFirst(data);
            return;
        }
        Node n = new Node(data);
        n.prev = FOOTER;
        n.next = FOOTER.next;
        FOOTER.next = n;
        FOOTER = n;
        HEADER.next.prev = FOOTER;
        HEADER.data+=1;
    }
    void insertBefore(int data,int before)
    {
        if(HEADER.next == null)
        {
            this.insertFirst(data);
        }
        Node temp = HEADER.next;
        while(temp.data != before && temp!=FOOTER)
        {
            temp = temp.next;
        }
        if(temp == FOOTER && temp.data != before)
        {
            System.out.println("Data not found");
            System.out.println("---------------------------------");
            return;
        }

        System.out.println("Before: "+temp.data);
        Node n = new Node(data);
        if(temp == HEADER.next){
            HEADER.next = n;

        }
        n.next = temp;
        n.prev = temp.prev;
        temp.prev.next = n;
        temp.prev = n;
        HEADER.data+=1;

    }
    void insertAfter(int data, int after)
    {
        if(HEADER.next == null)
        {
            this.insertFirst(data);
        }
        Node temp = HEADER.next;
        while(temp.data != after && temp!=FOOTER)
        {

            temp = temp.next;
        }
        if(temp == FOOTER && temp.data != after)
        {
            System.out.println("Data not found");
            System.out.println("---------------------------------");
            return;
        }
//        System.out.println("After: "+temp.data);
//        System.out.println("Next: "+temp.next.data);

        Node n = new Node(data);
        if(temp == FOOTER)
        {
            FOOTER = n;
        }
        n.prev = temp;
        n.next = temp.next;
        temp.next.prev = n;
        temp.next = n;
        HEADER.data+=1;
    }

    void deleteFirst()
    {
        if(HEADER.next == null)
        {
            System.out.println("Empty Linked List");
            System.out.println("---------------------------------");
            return;
        }
        if(HEADER.data == 1){
            System.out.println("Deleted Element: "+HEADER.next.data);
            HEADER.next = null;
            return;
        }
        Node temp = HEADER.next;
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        HEADER.next = temp.next;
        System.out.println("Deleted Element: "+temp.data);
        HEADER.data--;
        System.out.println("---------------------------------");
    }

    void deleteLast()
    {
        if(HEADER.next == null)
        {
            System.out.println("Empty Linked List");
            System.out.println("---------------------------------");
        }
        if(HEADER.data == 1){
            System.out.println("Deleted Element: "+HEADER.next.data);
            HEADER.next = null;
            return;
        }
        Node temp = FOOTER;
        temp.prev.next = temp.next;
        FOOTER = temp.prev;
        HEADER.next.prev = FOOTER;
        System.out.println("Deleted Element: "+temp.data);
        HEADER.data--;
        System.out.println("--------------------------------------");
    }

    void deleteBefore(int before)
    {
        if(HEADER.next == null)
        {
            System.out.println("Empty Linked List");
            System.out.println("---------------------------------");
        }
        if(HEADER.data == 1){
            System.out.println("List contains only one element");
            return;
        }
        Node temp = HEADER.next;
        while(temp.data != before && temp!=FOOTER)
        {
            temp = temp.next;
        }

        if(temp == FOOTER && temp.data!=before)
        {
            System.out.println("Element not found");
            System.out.println("---------------------------------");
            return;
        }
        if(temp == HEADER.next)
        {
            this.deleteLast();
            return;
        }
        Node delete = temp.prev;
        delete.prev.next = temp;
        temp.prev = delete.prev;
        System.out.println("Deleted: "+delete.data);
        HEADER.data--;
        if(delete == FOOTER){
            FOOTER = delete.prev;
        }
        System.out.println("---------------------------------");
    }

    void deleteAfter(int after)
    {
        if(HEADER.next == null)
        {
            System.out.println("Empty Linked List");
            System.out.println("---------------------------------");
        }
        if(HEADER.data == 1){
            System.out.println("List contains only one element");
            return;
        }
        Node temp = HEADER.next;
        while(temp.data != after && temp!=FOOTER)
        {
            temp = temp.next;
        }
        if(temp == FOOTER && temp.data!=after)
        {
            System.out.println("Element not found");
            System.out.println("---------------------------------");
            return;
        }
        if(temp == FOOTER){
            this.deleteFirst();
            return;
        }
        Node delete = temp.next;
        temp.next = delete.next;
        delete.next.prev = temp;
        if(delete == FOOTER)
        {
            FOOTER = delete.prev;
        }
        HEADER.data--;
        System.out.println("Deleted Element: "+delete.data);
        System.out.println("------------------------------");
    }

    void print(){
        Node temp = HEADER.next;
        if(temp == null)
        {
            System.out.println("Empty Linked List");
            return;
        }

        System.out.println("Elements Count: "+HEADER.data);
        int count = HEADER.data;
        while(count!=0)
        {
            System.out.println(temp.data +" ");
            temp = temp.next;
            count--;
        }
        System.out.println("-----------------------------------");
        System.out.println("Header: "+HEADER.next.data);
//        System.out.println("-----------------------------------");
        System.out.println("Footer: "+FOOTER.data);
        System.out.println("-----------------------------------");
    }

}
