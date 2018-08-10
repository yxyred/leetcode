package com.example.Myleetcode.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

/*题目描述
Evaluate the value of an arithmetic expression in Reverse Polish Notation.
Valid operators are+,-,*,/. Each operand may be an integer or another expression.
Some examples:
  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6.*/


@Slf4j
public class evalRPN {
    public static void main(String[] args) {
        String[] input = {"4", "13", "5", "/", "+"};
        int res = new evalRPN().operators(input);
        log.info("{}",res);
    }
    private int operators(String[] input){
        Stack stack = new Stack();
        int res = 0;
        for (int i = 0;i<input.length;i++){
            if (input[i].equals("+")){
                res = Integer.valueOf( stack.pop().toString())+Integer.valueOf(stack.pop().toString());
                stack.push(res);
            }else if(input[i].equals("-")){
                res = -Integer.valueOf( stack.pop().toString())+Integer.valueOf(stack.pop().toString());
                stack.push(res);
            }else if (input[i].equals("*")){
                res = Integer.valueOf( stack.pop().toString())*Integer.valueOf(stack.pop().toString());
                stack.push(res);
            }else if (input[i] .equals( "/")){
                res = Integer.valueOf( stack.pop().toString());
                int mm = Integer.valueOf(stack.pop().toString());
                stack.push(mm/res);
            }else{
                stack.push(input[i]);
            }
        }
        res = Integer.valueOf( stack.pop().toString());
        return res ;
    }

}
