package com.example.Myleetcode.sort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BinarySearch {
    public static void main(String[] args){
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int target = 3;
        int res = new BinarySearch().getValueByBinaSearch(input,target);
        log.info("{},{},{}",input,target,res);
    }
    private int getValueByBinaSearch(int[] input,int target){
        int start = 0, end = input.length-1;
        while (start <= end){
            int mid = (start + end ) / 2;
           if (input[mid] == target){
               return mid;
           }else if(input[mid] < target){
               start = mid +1;
           }else{
               end = mid -1;
           }
        }
        return -1;
    }
}
