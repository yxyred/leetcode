package com.example.Myleetcode.sort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MergeSort_split {
    static int[] input = new int[]{3, 4, 2, 1, 5, 11, 45, 22};
    public static void main(String[] args){

        log.info("{}",input);

         new MergeSort_split().setSort(input,0,input.length-1);
        log.info("{}",input);
    }
    private void setSort(int[] input ,int start,int end){
        if(start >= end ){
            return;
        }
        int mid = (start + end)/2;
        setSort(input,start,mid);
        setSort(input,mid+1,end);
        setMergeSort(input,start,mid,end);
    }
    private void setMergeSort(int[] input,int start,int mid , int end){
        int[] tem = new int[input.length];

       for ( int i = start; i <= end ; i ++){
           tem[i] = input[i];
       }
        int i= start,j=mid +1;
       for (int h = start;h<= end;h++){
           if (i > mid){
               input[h] = tem[j++];
           }else if(j > end){
               input[h] = tem[i++];
           } else if (tem[i] < tem[j]){
               input[h] = tem[i++];
           }else if (tem[i] > tem[j]){
               input[h] = tem[j++];
           }
       }
    }
}
