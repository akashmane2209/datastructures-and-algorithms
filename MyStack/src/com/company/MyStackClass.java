package com.company;

public class MyStackClass {
    int [] myStack;
    int top;
    //Constructor for initializing stack with specific length
    MyStackClass(int length){
        this.myStack = new int[length];
        this.top = -1;
    }

    //Pushing element to the top of the stack
    public void push(int number){
        if( top >= myStack.length-1){
            System.out.println("Overflow Condition");
        }
        else{
            top++;
            myStack[top] = number;
        }
    }
    //Poping element from the top of the stack
    public int pop(){
        if(top < 0){
            System.out.println("Underfow condition");
            return -1;
        }
        else{
            int item = myStack[top];
            top--;
            return item;
        }
    }

    //Peeking the topmost element of the stack
    public int peek(){
        if(top == -1){
            System.out.println("Empty stack");
            return -1;
        }
        else{
            return myStack[top];
        }
    }

    //Printing the stack
    public void print(){
        if(top == -1){
            System.out.println("Empty Stack");

        }
        else{
            for(int i=0;i<top;i++){
                System.out.println(myStack[i]);
            }
        }
    }
}
