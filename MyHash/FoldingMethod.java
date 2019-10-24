package com.company;

import java.util.Arrays;

public class FoldingMethod {
    int generateHash(int key)
    {
        String k = Integer.toString(key);
        String[] hash = new String[k.length()/2];
        int j = 0;
        for(int i=0;i<k.length();i=i+2)
        {
            String temp = k.charAt(i)+""+k.charAt(i+1);
            hash[j] = temp;
            j++;
        }
        int sum = 0;
        for(int i=0;i<hash.length;i++)
        {
           sum+=Integer.parseInt(hash[i]);
        }
        if(String.valueOf(sum).length() > 2)
        {
            String s = String.valueOf(sum);
            return Integer.parseInt(s.substring(s.length()-2));
        }
        return sum;
    }
}