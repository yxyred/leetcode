package com.example.Myleetcode.sort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShellSort {
    public static void main(String[] args){
        int[] input = new int[]{3, 4, 2, 1, 5, 11, 45, 22};
        log.info("{}",input);
         new ShellSort().setShellSort(input);
        log.info("{}",input);
    }
    private void setShellSort(int[] input){
        int h = 1;
        while(h < input.length/3){
            h = h*3 + 1;
        }
      while (h >= 1){
            for (int i = h;i < input.length;i++){
                for (int j = i; j >= h && input[j] < input[j-h];j -= h){
                    swap(input,j,j-h);
                }
            }
            h = h /3;
      }
    }
    private void swap(int[] input,int i , int j ){
        int tem = input[i];
        input[i] = input[j];
        input[j] = tem;
    }
}
