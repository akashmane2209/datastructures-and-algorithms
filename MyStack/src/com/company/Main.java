package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int option;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of stack: ");
        int len = s.nextInt();
        MyStackClass stack = new MyStackClass(len);

        while(true){
            //Displaying menu
            System.out.println("Choose 1 to push element into the stack: ");
            System.out.println("Choose 2 to pop element from the stack: ");
            System.out.println("Choose 3 to peek the top of the stack: ");
            System.out.println("Choose 4 to print the stack: ");
            System.out.println("Choose 5 to exit the code: ");
            System.out.println("Select option: ");
            option = s.nextInt();

            switch (option){
                case 1: //PUSH
                    System.out.println("Enter element to push");
                    int item = s.nextInt();
                    stack.push(item);
                    break;
                case 2: //POP
                    int remove = stack.pop();
                    System.out.println("Item removed:"+remove);
                    break;
                case 3: //PEEK
                    System.out.println("Item at the top"+stack.peek());
                    break;
                case 4: //PRINT
                    stack.print();
                    break;
                case 5: //CLOSE MENU
                    return;
                default: //INVALID OPTION
                    System.out.println("Invalid option");
            }
        }
    }
}
