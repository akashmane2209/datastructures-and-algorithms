package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashingDemo h = new HashingDemo();
        int hash;
        Record[] data = new Record[10];
        Record r1 = new Record(1,"Akash");
        h.addData(r1);
        Record r2 = new Record(2,"Akshay");
        h.addData(r2);
        Record r3 = new Record(3,"Anaaand");
        h.addData(r3);
        Record r4 = new Record(4,"Anaaaaaaaaaand");
        h.addData(r4);
        Record r5 = new Record(5,"Ananadddddddd");
        h.addData(r5);
        Record r6 = new Record(6,"Anannnnnnnnd");
        h.addData(r6);
        Record r7 = new Record(7,"Annnand");
        h.addData(r7);
        Record r8 = new Record(8,"Anand");
        h.addData(r8);
        Record r9 = new Record(9,"Anaasdfsand");
        h.addData(r9);
        Record r10 = new Record(10,"Anasdfadsfsdfdsfnd");
        h.addData(r10);

//        System.out.println(h.search(7));

//        h.printTable();
        FoldingMethod f = new FoldingMethod();
        System.out.println(f.generateHash(12344444));;
    }
}
