package com.example.Myleetcode.leetcode;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Scanner;

/*自动售货机里有 N 瓶复制可乐。复制可乐非常神奇，喝了它的人会复制出一个自己来！
现在有 Alice, Bob, Cathy, Dave 四个人在排队买复制可乐。买完的人会马上喝掉，
然后他和他的副本会重新去队伍的最后面排队买可乐。
问最后一个买到复制可乐的人叫什么名字？*/
@Slf4j
public class Copy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if( n == 0){
            System.out.println(" ");
        }
        String res = new Copy().getName(n);
        log.info("{},{}",n,res);
    }
    public String getName(int n){
        ArrayList<String> stuck = new ArrayList<String>();
        String cach = null;
        stuck.add("Alice");
        stuck.add("Bob");
        stuck.add("Cathy");
        stuck.add("Dave");
        for (int i = 0;i< n ;i ++){
            cach = stuck.remove(0);
            stuck.add(cach);
            stuck.add(cach);
        }
        return cach;
    }
}
