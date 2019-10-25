package com.company;

import java.util.Stack;

class TreeNode{
    String data;
    TreeNode left;
    TreeNode right;
    TreeNode(String data)
    {
        this.data = data;
    }
}

public class ExpressionTree {
    Stack<Character> operators = new Stack<Character>();
    String expression;
    String postFixExpression = "";

    public int checkPrecedence(char c){
        switch (c){
            case '+':
            case '-':
                return 0;
            case '/':
            case '*':
                return 1;
            case '^':
                return 2;
            case '(':
                return -3;
            default:
                return -1;
        }
    }
    public String evaluatePostFix(String infixExpression){
        System.out.println("Inside Evaluate");
        this.expression =  infixExpression.concat(")");
        System.out.println("Expression: "+expression);
        this.operators.push('(');
//        System.out.println(operators.empty());
        int i = 0;
        System.out.println("----------------------------------");
        while(!operators.empty()){
//            System.out.println("Not empty");
            Character current = expression.charAt(i);

            System.out.println("Current: "+current);
            if(current == '('){
                operators.push(current);
            }
            else if(current == ')' ){

                int flag = 1;
                while(flag == 1){
                    char operatorAtTop = operators.peek();
                    if(operatorAtTop == '('){
                        operators.pop();
                        flag = 0;
                    }
                    else{
                        postFixExpression+=operators.pop();
                    }
                }
            }
            else if(checkPrecedence(current) == -1)
            {

                postFixExpression+=expression.charAt(i);
            }
            else if(checkPrecedence(current) != -1){
                int flag = 1;
                while(flag == 1){
                    char operatorAtTop = operators.peek();
                    int precendenceAtTop = checkPrecedence(operatorAtTop);
                    int precendenceOfChar = checkPrecedence(current);
//                    System.out.println("Top: "+operatorAtTop+" Precedence at Top: "+precendenceAtTop);
//                    System.out.println("Current: "+current+" Precedence of Current: "+precendenceOfChar);
                    if(precendenceAtTop >= precendenceOfChar){
                        postFixExpression+=operators.pop();
                    }
                    else{
                        flag = 0;
                        operators.push(current);
                    }
                }

            }
            System.out.println("Stack after: "+operators);
            i++;
            System.out.println("Expression: "+postFixExpression);
            System.out.println("----------------------------------");
        }

        return postFixExpression;
    }
    void generateTree(String expression)
    {
        //Stack of Characters of the Expression
        Stack<TreeNode> stack = new Stack<>();
        //PostFix Expression for the given expression
        expression = this.evaluatePostFix(expression);
       for(int i=0;i<expression.length();i++)
       {
           char current = expression.charAt(i);
           TreeNode t = new TreeNode(String.valueOf(current));
            //If operands add to stack
           if(!(current == '+' || current == '*' ||  current =='-' || current == '/' || current == '^'))
           {
                stack.push(t);
           }
           //Else add right child and left child of the operator from the stack and add operator node to the stack
           else
           {
               t.right = stack.pop();
               t.left = stack.pop();
               stack.push(t);
           }
       }
       //Root of the tree is the only element in the stack
       this.inorder(stack.peek());
    }

    void inorder(TreeNode root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data);
            inorder(root.right);
        }
    }
}
