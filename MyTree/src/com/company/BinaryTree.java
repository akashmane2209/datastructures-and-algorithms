package com.company;

import java.util.List;

public class BinaryTree {
    ListNode root;
    void insert(ListNode n)
    {

      if(root == null)
      {
          //Empty Tree
          root = n;
          return;
      }
        ListNode parent = this.search(n)[0];
//        System.out.println(parent.data+" "+n.data);
      if(parent.data < n.data)
      {
          System.out.println(n.data+" Inserted to the Right of "+parent.data);
          parent.right = n;
      }
      else{
          System.out.println(n.data+" Inserted to the Left of "+parent.data);
          parent.left = n;
      }
    }

    void delete(ListNode n)
    {
        ListNode[] result = this.search(n);
        ListNode parent = result[0];
        ListNode child = result[1];

        if(parent == null)
        {
            System.out.println("Empty Tree or element not found");
            return;
        }
        if(child.left == null && child.right == null){
            if(parent.data > child.data)
            {
                parent.left = null;
            }
            else{
                parent.right = null;
            }
        }
        else if(child.right == null)
        {
            //Has a left Child
            if(parent.data > child.data)
            {
                parent.left = child.left;
            }
            else{
                parent.right = child.left;
            }
        }
        else if(child.left == null)
        {
            //Has a Right Child
            if(parent.data > child.data)
            {
                parent.left = child.right;
            }
            else{
                parent.right = child.right;
            }
        }
        else{
            ListNode temp = child.left;
            ListNode prevDel = child;
            while(temp.left!=null && temp.right!=null)
            {
               prevDel = temp;
               temp = temp.right;
            }
            if(prevDel.data > temp.data)
            {
                prevDel.left = null;
            }
            else {
                prevDel.right = null;
            }
            if(parent.data < result[1].data)
            {
                //Deleting the left
                parent.left = temp;
                temp.left = result[1].left;
                temp.right = result[1].right;
            }
            else{
                parent.right = temp;
                temp.left = result[1].left;
                temp.right = result[1].right;
            }
        }
        System.out.println("Deleted: "+child.data);
    }


    private ListNode[] search(ListNode n)
    {
        if(root == null)
        {
            return null;
        }
        ListNode[] result = new ListNode[2];
        ListNode temp = root;
        ListNode parent = root;
        while(temp!=null)
        {

            if(temp.data == n.data)
            {
                result[0] = parent;
                result[1]= temp;
                return result;
            }
            if(temp.data < n.data)
            {
                parent = temp;
                temp = temp.right;
            }
            else{
                parent = temp;
                temp = temp.left;
            }
        }
        result[0] = parent;
        result[1]= temp;
        return result;
    }

    void inorder(ListNode root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
}
