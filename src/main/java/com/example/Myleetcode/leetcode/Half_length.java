package com.example.Myleetcode.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

/*数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
如果不存在则输出0。*/
@Slf4j
public class Half_length {
    public static void main(String[] args) {
        int[] inter = {1};
        int res;
        res = new Half_length().MoreThanHalfNum(inter);
        log.info("{}",res);
    }
    public int MoreThanHalfNum(int[] array){
        int halflength = array.length / 2;
        HashMap hashMap = new HashMap();
        int count = 0;
        int j = 0;
        for(int i = 0; i<array.length;i++){
            if(hashMap.containsKey(array[i])){
                hashMap.put(array[i],(Integer) hashMap.get(array[i])+ 1);
                if(count < (Integer) hashMap.get(array[i])){
                    count = (Integer) hashMap.get(array[i]);
                    j = i;
                }
            }else{
                hashMap.put(array[i],1);
                if(count < (Integer) hashMap.get(array[i])){
                    count = (Integer) hashMap.get(array[i]);
                    j = i;
                }
            }
        }
        if(count > halflength) return array[j];
        return 0;
    }
}
