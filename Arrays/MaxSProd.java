package com.company;

import java.util.Stack;

public class MaxSProd {
    public int maxSpecialProduct(int[] A) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i=1;i<A.length-1;i++)
        {
            int current = A[i];

            int leftSpecial;
            int rightSpecial = i;
            System.out.println("Current: "+current);
            while(!stack.isEmpty() && A[stack.peek()] <= current)
            {
                stack.pop();
            }
            if(stack.isEmpty()){
                leftSpecial = 0;
            }
            else{
                leftSpecial = stack.peek();
            }

            for(int j=i+1;j<A.length;j++)
            {
                if(leftSpecial == 0)
                {
                    break;
                }
                if(A[j] > A[rightSpecial])
                {
//                    System.out.println(A[j]);
                    rightSpecial = j;
                    break;
                }
            }
            if(rightSpecial == i){
                rightSpecial = 0;
            }
            System.out.println("Left Special: "+leftSpecial+" Right Special: "+rightSpecial);
            System.out.println("Special: "+leftSpecial*rightSpecial);
            if(res < rightSpecial*leftSpecial)
            {
                res = leftSpecial*rightSpecial;
            }
            System.out.println(stack);
            stack.push(i);


        }
        return res;
    }
}
