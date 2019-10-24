package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinaryTree b = new BinaryTree();
        ListNode n = new ListNode(10);
        ListNode n1 = new ListNode(9);
        ListNode n2 = new ListNode(11);
        ListNode n3 = new ListNode(8);
        ListNode n4 = new ListNode(13);
        ListNode n5 = new ListNode(12);
        ListNode n6 = new ListNode(15);
        b.insert(n);
        b.insert(n1);
        b.insert(n2);
        b.insert(n3);
        b.insert(n4);
        b.insert(n5);
        b.insert(n6);
//        b.insert();
        b.inorder(n);

        b.delete(n3);
//        b.delete(n);
        b.inorder(n);
    }
}
