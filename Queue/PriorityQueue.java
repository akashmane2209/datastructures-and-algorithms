package com.company;

import java.io.ObjectStreamException;
import java.util.ArrayList;

public class PriorityQueue {
    ArrayList<Item> PQ;
    int top = -1;
    int rear = -1;
    int size;
    PriorityQueue(int len)
    {
        this.size = len;
        this.PQ = new ArrayList<Item>(len);
    }
    void enque(Item item)
    {
        if(top == -1){
            top = 0;
        }
        System.out.println(PQ.size());
        rear = (rear+1)%size;
        PQ.add(rear,item);
        System.out.println("Queue after enque: "+PQ.get(rear).value);
    }
    void deque() {
        int priority = PQ.get(top).priority;
        Item removed = PQ.get(top);
        int removedIndex = 1;
        if (top < rear) {
            for (int i = top; i <= rear; i++) {
                int current = PQ.get(i).priority;
                if (current > priority) {
                    priority = current;
                    removedIndex = i;

                }
            }
            PQ.remove(removedIndex);
            rear--;
            System.out.println("After DQ: " + removedIndex);
            return;

        } else {
            Boolean flag = false;
            for (int i = top; i < PQ.size(); i++) {
                int current = PQ.get(i).priority;
                if (current > priority) {
                    priority = current;
                    removedIndex = i;
                    flag = true;

                }
            }

            for (int i = 1; i <= rear; i++) {
                int current = PQ.get(i).priority;
                if (current > priority) {
                    priority = current;
                    removedIndex = i;

                }
            }
            if (flag == true) {
                top--;

            } else {
                rear--;
                top--;
            }
            System.out.println("After DQ: " + removedIndex);
        }
        PQ.remove(removedIndex);
    }



}
