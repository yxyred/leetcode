package com.example.Myleetcode.jianzhioffer;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;


/*
* 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
* 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。*/
@Slf4j
public class ListAndMap {
    public static void main(String[] args) {
        int[] input = {3,32,321};
        log.info("{}",input);
        Vector vector = new Vector();
        ArrayList list1 = new ArrayList();
        List list = new CopyOnWriteArrayList();//使用重入锁实现同步
        List<String> synList = Collections.synchronizedList(list);//使用一个类内对象作为锁
        LinkedList linkedList = new LinkedList();
        HashMap hashMap = new HashMap();
        Hashtable hashtable = new Hashtable();
        ConcurrentHashMap concurrentMap = new ConcurrentHashMap();
        char c = '中';
        System.out.println(c);
    }

}
