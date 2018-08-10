package com.example.Myleetcode.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*题目描述
Evaluate the value of an arithmetic expression in Reverse Polish Notation.
Valid operators are+,-,*,/. Each operand may be an integer or another expression.
Some examples:
  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6.*/


@Slf4j
public class wangyi {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Scanner in = new Scanner(System.in);
        //注意while处理多个case
        int a = in.nextInt();
        for(int i = 0 ; i < a ; i ++){
            list.add(in.nextInt());
        }
        new wangyi().getTaxlist(list);
    }
    // 本题为考试单行多行输入输出规范示例，无需提交，不计分。
    private void getTaxlist(ArrayList list){
        if(list == null && list.size() >0) return;
        for (int i = 0; i < list.size();i++){
            if( list.get(i) == null ){
                continue;
            }
            Pattern pattern = Pattern.compile("[0-9]*");
            Matcher isNum = pattern.matcher(list.get(i).toString());
            if( !isNum.matches() ){
                continue;
            }
            int res  = Integer.valueOf(list.get(i).toString());

            if(res <= 5000){
                System.out.println(0);
            }else{
                res = res -5000;
                res = gettax(res);
                System.out.println(res);
            }
        }
    }
    private int gettax(int input){
        if(input <= 3000){
            return (int) Math.round ((input - 3000)*0.03);
        }else if (input <= 12000 ){
            return (int) Math.round(3000*0.03 + (input - 3000)*0.1);
        } else if(input <= 25000){
            return (int) Math.round(3000*0.03 + 9000*0.1 + (input - 15000) * 0.2);
        }else if(input <= 35000){
            return (int) Math.round (3000*0.03 + 9000*0.1 + 13000 * 0.2 + (input - 35000) * 0.25);
        } else if(input <= 55000){
            return (int) Math.round (3000*0.03 + 9000*0.1 + 13000 * 0.2 + 10000 * 0.25 + (input - 35000) * 0.3);
        }else if(input <= 80000){
            return (int) Math.round (3000*0.03 + 9000*0.1 + 13000 * 0.2 + 10000 * 0.25 +20000 * 0.3 + (input - 55000) * 0.35);
        }else{
            return (int) Math.round (3000*0.03 + 9000*0.1 + 10000 * 0.2 + 20000 * 0.25 +20000 * 0.3 + 25000 * 0.35 + (input - 80000) * 0.45);
        }
    }
}
