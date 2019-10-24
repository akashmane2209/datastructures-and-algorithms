package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner s = new Scanner(System.in);
//        System.out.println("Enter size of queue: ");
//        int len = s.nextInt();
         PriorityQueue queue = new PriorityQueue(5);
        int option;
        Item item1 = new Item(10,1); //0
        queue.enque(item1);
        Item item2 = new Item(22,4); //1,
        queue.enque(item2);
        Item item3 = new Item(12,2); //2,1
        queue.enque(item3);
        Item item4 = new Item(32,4); //3,2
        queue.enque(item4);
        Item item5 = new Item(42,3); //4,3,2
        queue.enque(item5);
        System.out.println("Removed");
        queue.deque();
        queue.deque();
        queue.deque();
        queue.deque();
        queue.deque();
//        while(true){

            //Displaying menu
//            System.out.println("Choose 1 to enque element into the queue: ");
//            System.out.println("Choose 2 to dequeue element from the queue: ");
//            System.out.println("Choose 3 to print the queue: ");
//            System.out.println("Choose 4 to exit the code: ");
//            System.out.println("Select option: ");
//            option = s.nextInt();
//
//            switch (option){
//                case 1: //PUSH
//                    System.out.println("Enter element to enque");
//                    int item = s.nextInt();
//                    queue.enque(item);
//                    break;
//                case 2: //POP
//                    int remove = queue.deque();
//                    System.out.println("Item removed:"+remove);
//                    break;
//
//                case 3: //PRINT
//                    queue.printQ();
//                    break;
//                case 4: //CLOSE MENU
//                    return;
//                default: //INVALID OPTION
//                    System.out.println("Invalid option");
//            }
//        }
    }
}
