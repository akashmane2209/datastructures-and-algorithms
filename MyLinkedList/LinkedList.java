package com.company;

public class LinkedList {
    Node HEAD;

    public void sortedInsert(int data){
        if(HEAD == null)
        {
            this.insertFirst(data);
        }
        Node temp = HEAD;
        while(temp!=null && data > temp.data){
            temp = temp.next;
        }
        if(temp == null){
            this.insertLast(data);
            return;
        }
        if(temp == HEAD){
            this.insertFirst(data);
            return;
        }
//        Node search = this.search(data);
        this.insertAfter(data,temp.data);
    }
    public void insertFirst(int data){
        Node n = new Node(data);
        n.next = HEAD;
        HEAD = n;
    }
    public void insertAfter(int data, int after)
    {
        Node temp = HEAD;
        if(temp == null){
            this.insertFirst(data);
            return;
        }
        while(temp.data != after && temp != null)
        {
            temp = temp.next;
        }
        if(temp == null)
        {
            System.out.println("Data not found");
            return;
        }
        Node n = new Node(data);
        n.next = temp.next;
        temp.next = n;
    }

    public void insertBefore(int data,int before)
    {
        Node temp = HEAD;
        Node prev = HEAD;

        if(temp == null || temp.data == before)
        {
            System.out.println("Inserting First");
            this.insertFirst(data);
            return;
        }
        while(temp != null && temp.data!=before)
        {
            prev = temp;
            temp = temp.next;

        }
        if(temp == null)
        {
            System.out.println("data not found");
            return;
        }
        Node n = new Node(data);
//        if(temp == HEAD){
//            n.next = HEAD;
//            HEAD = n;
//        }
        n.next = temp;
        prev.next = n;
    }

    public void insertLast(int data)
    {
        Node temp = HEAD;

        while(temp.next != null)
        {
            temp = temp.next;
        }

        Node n = new Node(data);
//
        temp.next = n;
    }

    public Node deleteFirst()
    {
        if(HEAD == null)
        {
            System.out.println("Empty List");
            return null;
        }
        Node temp = HEAD;
        HEAD = temp.next;
        System.out.println("Deleted: "+temp.data);
        return temp;
    }

    public void deleteLast()
    {
        if(HEAD == null)
        {
            System.out.println("Empty List");
            return;
        }
        Node temp = HEAD;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        System.out.println("Element deleted:"+temp.next.data);
        temp.next = null;


    }

    public Node deleteAfter(int data)
    {
        if(HEAD == null)
        {
            System.out.println("Empty List");
            return null;
        }
        Node temp = HEAD;
        while(temp.next.next!=null && temp.data!=data){
            temp = temp.next;
        }
//        System.out.println("Data: "+data);
//        System.out.println("Search: "+temp.data);
        if(temp == null)
        {
            System.out.println("Not found");
            return null;
        }
        if(temp.next.next == null){
//            this.deleteLast();
            System.out.println("End of List");
            return null;

        }
        Node nextNode = temp.next;
        temp.next = nextNode.next;
        System.out.println("Deleted: "+nextNode.data);
        return nextNode;
    }

    public Node deleteBefore(int data)
    {
        if(HEAD == null)
        {
            System.out.println("Empty List");
            return null;
        }

        Node temp = HEAD;

//        Node prev = HEAD;
        while(temp!=null  && temp.next.next != null && temp.next.next.data != data)
        {
           temp = temp.next;
        }

        if(temp.next.next == null){
            System.out.println("Element not found");
            return null;
        }
        System.out.println("Element Deleted: "+temp.next.data);
        temp.next = temp.next.next;

        return temp.next;
    }

    public Node search(int data)
    {
        Node temp = HEAD;
        Node prev = HEAD;
        if(temp == null)
        {
            System.out.println("Empty List");
            return null;
        }
        while(temp!=null && temp.data == data)
        {
            prev = temp;
            temp = temp.next;
        }
        if(temp == null)
        {
            System.out.println("Data not found");
        }
        return prev;
    }

    public void print(){
        Node temp = HEAD;
        if(temp == null)
        {
            System.out.println("Empty Linked List");
            return;
        }
        while(temp != null)
        {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
//
        System.out.println("------------------------");
    }

}
