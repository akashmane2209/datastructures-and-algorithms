package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class MyQueue {
    int front = -1 ;
    int rear = -1;
    int[] q;

    MyQueue(int queueSize){
        this.q = new int[queueSize];
    }
    public void enque( int item){
        if(rear == q.length-1 || rear== front-1){
            System.out.println("Overflow Condition");
            return;
        }
        if(front == -1){
            front++;
        }
        rear++;

        q[rear] = item;
    }
    public int deque(){
        if(front == -1){
            System.out.println("Underflow Condition");
            return -1;
        }
        else{
            int item = q[front];
            if(front == rear){
                front = -1;
                rear = -1;
            }
            else{
                front++;
                if(front == q.length-1){
                    front = 0;
                }
            }
            return item;
        }
    }
    public void printQ(){
        if(front<rear && rear < q.length) {
            for (int i = front; i <= rear; i++) {
                System.out.println("Elements in Queue: " + q[i] + " ");

            }
        }
            else{
                if(front > rear){
                    for(int i=front;i<q.length;i++){
                        System.out.println(q[i]+" ");
                    }
                    for(int i=0;i<=rear;i++){
                        System.out.println(q[i]+" ");
                    }
                }
            }



    }

}
