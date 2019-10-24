package com.company;

import org.jetbrains.annotations.NotNull;

public class MidSquareMethod {
    private Record[] table = new Record[10];
    private int generateHash(int key)
    {
        key *=key;
        String k = String.valueOf(key);
        int l = k.length();
        if(k.length() <= 2)
        {
            return Integer.parseInt(k);
        }
        String hash = k.charAt(0) +""+ k.charAt(1);
        return Integer.parseInt(hash);
    }
    void addData(@NotNull Record r)
    {
        int hash = this.generateHash(r.key);
        if(table[hash]==null){
            table[hash] = r;
        }
        else{
            while(table[hash]!=null)
            {
                hash = (hash+1)%table.length;
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
            key++;
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
        for (Record record : table) {
            if (record != null)
                System.out.println(record.value);
        }

    }

}
