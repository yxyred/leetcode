package com.example.Myleetcode.sort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BubbleSort {
    public static void main(String[] args){
        int[] input = new int[]{3, 4, 2, 1, 5, 11, 45, 22};
        log.info("{}",input);
         new BubbleSort().setSelectSort(input);
        log.info("{}",input);
    }
    private void setSelectSort(int[] input){
        boolean hassort = false;
       for(int i = 0 ; i< input.length && !hassort;i++){
           hassort = true;
           for (int j = 0 ;j <input.length-i-1;j++){
               if (input[j] > input[j +1] ){
                   swap(input,j +1,j);
                   hassort = false;
               }
           }

       }
    }
    private void swap(int[] input,int i , int j ){
        int tem = input[i];
        input[i] = input[j];
        input[j] = tem;
    }
}
