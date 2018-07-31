package com.example.Myleetcode.sort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SelectSort {
    public static void main(String[] args){
        int[] input = new int[]{3, 4, 2, 1, 5, 11, 45, 22};
        log.info("{}",input);
         new SelectSort().setSelectSort(input);
        log.info("{}",input);
    }
    private void setSelectSort(int[] input){
       for(int i = 0 ; i< input.length;i++){
           int min = i;
           for (int j = i +1 ;j <input.length;j++){
               if (input[min] > input[j] ){
                   min = j;
               }
           }
           swap(input,i,min);
       }
    }
    private void swap(int[] input,int i , int j ){
        int tem = input[i];
        input[i] = input[j];
        input[j] = tem;
    }
}
