package com.example.Myleetcode.leetcode;

import lombok.extern.slf4j.Slf4j;
/*
*在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
* 但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
* 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
* 你会不会被他忽悠住？(子向量的长度至少是1)
* [1,-2,3,10,-4,7,2,-5]
* */
@Slf4j
public class FindGreatestSumOfSubArray {
    public static void main(String[] args) {

        int[] input = {1,-2,3,10,-4,7,2,-5};
        int res = new FindGreatestSumOfSubArray().GetGreatestSum(input);
        log.info("{},{}",input,res);
    }
    public int GetGreatestSum(int[] array){
        if (array == null || array.length == 0)return Integer.parseInt(null);
        int max = Integer.MIN_VALUE;
        for (int i = 0;i < array.length;i ++){
            int tem  = 0;
            for (int j = i;j < array.length; j ++){
                tem += array[j];
                if (max < tem){
                    max = tem;
                }
            }
        }
        return max;
    }
}
