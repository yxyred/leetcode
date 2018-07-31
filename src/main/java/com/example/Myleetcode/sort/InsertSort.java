package com.example.Myleetcode.sort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InsertSort {
    public static void main(String[] args){
        int[] input = new int[]{3, 4, 2, 1, 5, 11, 45, 22};
        log.info("{}",input);
         new InsertSort().setSelectSort(input);
        log.info("{}",input);
    }
    private void setSelectSort(int[] input){
       for(int i = 1 ; i< input.length;i++){
           for (int j = i;j > 0  && input[j] > input[j -1] ;j--){
                   swap(input,j -1,j);
           }

       }
    }
    private void swap(int[] input,int i , int j ){
        int tem = input[i];
        input[i] = input[j];
        input[j] = tem;
    }
}
