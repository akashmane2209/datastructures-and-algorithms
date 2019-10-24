package com.company;

public class DQueue {
    int left = -1;
    int right = -1;
    int[] DQ;
    DQueue(int len){
        this.DQ = new int[len];
    }

    void insertLeft(int item){
        if(right==-1){
            right=0;
        }
        if((left+1)%DQ.length == 0){
            System.out.println("Overflow Conditon");
            return;
        }
        if(left == 0){
            left = DQ.length -1;
        }
        else{
            left =left-1;
        }

        DQ[left] = item;
    }

    void insertRight(int item){
       if(left == -1){
           left = 0;
       }
       if(right == DQ.length-1 || right == left-1){
           System.out.println("Overflow Condition");
           return;
       }
       right = (right+1)%DQ.length;
       DQ[right] = item;
    }
    int deleteRight(){
        if(right == -1){
            System.out.println("Underflow Condition");
            return -1;
        }
        else{
            int item = DQ[right];
            if(right == 0){
                right = DQ.length-1;
            }
            else{
                right--;
            }

            return item;
        }
    }
    int deleteLeft(){
        if(left == -1){
            System.out.println("Underflow Condition");
            return -1;
        }
        else{
            int item = DQ[left];

            left = (left+1)%DQ.length;
            return item;
        }
    }

    void printQDQ(){
        if(right > left){
            for(int i=left;i<=right;i++){
                System.out.println(DQ[i]+" ");
            }

        }
        else{
            for(int i= left;i<DQ.length-1;i++){
                System.out.println(DQ[i]+" ");
            }
            for(int i=0;i<=right;i++){
                System.out.println(DQ[i]+" ");
            }
        }
    }
}
