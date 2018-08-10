package com.example.Myleetcode.sort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HeapSort {
    public static void main(String[] args){
        int[] input = new int[]{3, 4, 2, 1, 5, 11, 45, 22};
        log.info("{}",input);
         new HeapSort().sort(input);
        log.info("{}",input);
    }
    private void sort(int[] input){
        for (int i = input.length/2 -1 ;i >= 0 ; i--){
            adjustHeap(input,i,input.length);
        }
        for (int j = input.length-1;j > 0;j--){
            swap(input,0,j);
            adjustHeap(input,0,j);
        }
    }
    private void adjustHeap(int[] input , int k , int length){
        int tem = input[k];
        for(int i = k *2 +1 ; i < length;i = 2*k +1){
            if (i+1 <length && input[i] < input [i +1]  ){
                i = i+1 ;
            }
            if (input[i] < tem){
                break;
            }
                input[k] = input[i];
                k=i;


        }
        input[k] = tem;
    }
    private void swap(int[] input,int i , int j ){
        int tem = input[i];
        input[i] = input[j];
        input[j] = tem;
    }
}
