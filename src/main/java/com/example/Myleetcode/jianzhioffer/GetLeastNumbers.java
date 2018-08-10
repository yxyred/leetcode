package com.example.Myleetcode.jianzhioffer;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

/*
* 输入n个整数，找出其中最小的K个数。
* 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
* */
@Slf4j
public class GetLeastNumbers {
    public static void main(String[] args) {
        int[] input = {4,5,1,6,2,7,3,8};
        ArrayList out = new ArrayList();
        out = new GetLeastNumbers().get_k_leastnumber(input,out,10);
        log.info("{}",String.valueOf(out));
    }
    public ArrayList get_k_leastnumber(int[] input, ArrayList res,int k){
        if(input == null || input.length ==0 || input.length  < k){
            return res;
        }
        for (int i = 0 ; i < k;i++){
            int tem = input[i] ;
            int min = i;
            for (int j = i ; j < input.length; j++){
                if(tem > input [j]){
                    tem = input[j];
                    min = j;
                }
            }
            swap(input,i,min);
            res.add(input[i]);
        }
        return res;
    }
    public  void  swap(int[] input ,int i ,int j ) {
        int tem = input[i];
        input[i] = input[j];
        input[j] = tem;
    }
}
