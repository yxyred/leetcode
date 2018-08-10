package com.example.Myleetcode.sort;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class QuickSort {
    public static void main(String[] args){
        Integer[] input = new Integer[]{3, 4, 2, 1, 5, 11, 45, 22};
        int[] ints1 = Arrays.stream(input).mapToInt(Integer::byteValue).toArray();
        log.info("{}",ints1);
        shuffle(input);
        int[] ints2 = Arrays.stream(input).mapToInt(Integer::byteValue).toArray();
        log.info("{}",ints2);
        new QuickSort().sort(ints2,0,ints2.length-1);
        log.info("{}",ints2);
    }
    private void sort(int[] input,int l ,int h){
        if(h<=l){
            return;
        }
        int tar = setQuickSort(input,l,h);
        setQuickSort(input,l,tar-1);
        setQuickSort(input,tar +1,h);
    }
    private int setQuickSort(int[] input,int start ,int end){
        int i = start+1,j = end;
        while (true){
            while (input[j] > input[start] && j>= start){
                j --;
            }
            while (input[i] <input[start] && i<= end){
                i++;
            }
            if (i>=j) {
                break;
            }
            swap(input,i,j);
        }
        swap(input,start,j);
        return j;
    }

    private static void shuffle(Integer[] input){
        List list = Arrays.asList(input);
        Collections.shuffle(list);
        list.toArray(input);
    }
    private void swap(int[] input,int i , int j ){
        int tem = input[i];
        input[i] = input[j];
        input[j] = tem;
    }
}
