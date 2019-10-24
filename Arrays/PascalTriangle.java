package com.company;

import java.util.Arrays;

public class PascalTriangle {
    public int[][] solve(int A) {
        int res[][] = new int[A][];
        for(int i=0;i<A;i++)
        {
            int[] number = new int[i+1];
            number[0] = 1;
            for(int j=0;j<i;j++){
                int newNumber = number[j] * (i-j)/(j+1);
                number[j+1] = newNumber;
            }
            res[i] = number;
//            System.out.println(Arrays.toString(res[i]));
        }
        System.out.println(Arrays.toString(res[0]));
        System.out.println(Arrays.toString(res[1]));
        System.out.println(Arrays.toString(res[2]));
        return res;
    }
}
