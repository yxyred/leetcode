package com.example.Myleetcode.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
*
* */
@Slf4j
public class Permutation {
    public static void main(String[] args) {
        String inter = "abcd";
        log.info(new Permutation().Permutation_no(inter).toString());
        System.out.println(new Permutation().Permutation_no(inter).toString());
    }
    public ArrayList Permutation_no(String inter){
        List<String> res = new ArrayList<>();
        PermutationHelper(inter.toCharArray(),0,res);
        Collections.sort(res);
        return (ArrayList) res;
    }
    public void PermutationHelper(char[] cs , int i, List<String> list){
        if(i == cs.length-1){
            String val = cs.toString();
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
