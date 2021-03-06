package com.example.Myleetcode.jianzhioffer;

import lombok.extern.slf4j.Slf4j;

/*
*在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
* 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。
* 即输出P%1000000007
* 示例：输入1,2,3,4,5,6,7,0 输出7
* */
@Slf4j
public class InversePairs {
    public static void main(String[] args){
        int[] pair = {1,2,3,4,5,6,7,0};
        int res = new InversePairs().getInverseNum(pair);
        log.info("{},{}",pair,res);
    }
    private int getInverseNum(int[] pair){
        int res = 0;
        for(int i = 0 ; i<pair.length-1;i++){
            for (int j = i+1 ;j < pair.length;j ++){
               if( pair[i] > pair[j]){
                    res ++;
               }
            }
        }
        return res;
    }
}
