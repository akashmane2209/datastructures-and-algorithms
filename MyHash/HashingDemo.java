package com.company;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Arrays;

public class HashingDemo {
    Record[] table = new Record[10];
    int modFactor;
    HashingDemo()
    {
//        this.input= data  ;
        modFactor = 7;
    }
    int generateHash(int input)
    {
       int hash;
       hash = input % modFactor;
       return hash;
    }

    void addData(Record r)
    {
        int hash = this.generateHash(r.key);
        int counter = 0;
       if(table[hash]==null){
           table[hash] = r;
       }

       else{
           while(counter<= table.length && table[hash]!=null)
           {
               hash = (hash+1)%table.length;
               counter++;
           }
           table[hash] = r;
       }
    }

    Record search(int key)
    {
        int hash = this.generateHash(key);
        int counter  = 0;
        while(counter < table.length && table[hash] !=null) {
            if (table[hash].key == key) {
                System.out.println("Found: " + table[hash].value);

            }
            key=key+1;
            hash++;
            counter++;
        }
        if(counter == table.length){
            System.out.println("Not Found");
            return null;
        }
        return table[hash];
    }
    void printTable(){
//        System.out.println(Arrays.toString(table));
        for(int i=0;i<table.length;i++)
        {
            if(table[i]!=null)
                System.out.println(table[i].value);
        }
    }
}
