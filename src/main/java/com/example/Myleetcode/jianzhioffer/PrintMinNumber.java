package com.example.Myleetcode.jianzhioffer;

import lombok.extern.slf4j.Slf4j;


/*
* 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
* 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。*/
@Slf4j
public class PrintMinNumber {
    public static void main(String[] args) {
        int[] input = {3,32,321};
        log.info("{}",input);
        String res = new PrintMinNumber().getPrintMinNumber(input);
        log.info("{},{}",input,res);
    }
    public String getPrintMinNumber(int[] number){
        String res = "";
        for (int i = 0; i < number.length;i++){
            int temp = number[i];
            int cache = i;
            for (int j = i ; j < number.length;j++){
                if (compare(number[j],temp)){
                    temp = number[j];
                    cache = j;
                }
            }

            swap(number,i,cache);
            res += temp;
        }
        return res;
    }
    /*i应该放在j前面*/
    public boolean compare(int i,int j){
        String ij = String.valueOf(i)+String.valueOf(j);
        String ji = String.valueOf(j)+String.valueOf(i);
        if (Integer.parseInt(ij) < Integer.parseInt(ji)){
            return true;
        }
        return false;
    }
    public void swap(int[] ints,int i ,int j){
        int tem = ints[i];
        ints[i] = ints[j];
        ints[j] = tem;
    }
}
