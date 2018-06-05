package com.example.Myleetcode.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
*全排列
* */
@Slf4j
public class Permutation {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList res = new Permutation().Permutation_no(scanner.next());
        log.info(res.toString());
        log.info("count:{}",res.size());
        scanner.close();
    }
    public ArrayList Permutation_no(String inter){
        List<String> res = new ArrayList<>();
        PermutationHelper(inter.toCharArray(),0,res);
        Collections.sort(res);
        return (ArrayList) res;
    }
    public void PermutationHelper(char[] cs , int i, List<String> list){
        if(i == cs.length-1){
            String val = String.valueOf(cs);
            if(!list.contains(val)){
                list.add(val);
            }
        }else{
            for(int j = i ;j < cs.length;j++){
                swap(cs,i,j);
                PermutationHelper(cs,i+1,list);
                swap(cs,i,j);
            }
        }
    }
    public void swap(char[] chars,int i ,int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
