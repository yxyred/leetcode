package com.example.Myleetcode.leetcode;


import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*在一个字符串(1<=字符串长度<=10000，
全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置*/
@Slf4j
public class FirstNotRepeatingChar {
    public static void main(String[] args) {
        String input = "bcadefbddddccees";
        int res = new FirstNotRepeatingChar().GetFirstNotRepeatChar(input);
        log.info("{}",res);
    }
    public int GetFirstNotRepeatChar(String str){
        if (str == null || str.length() == 0){
            return -1;
        }

        LinkedHashMap<Character,Integer> checkarr =  new LinkedHashMap ();
        for (int i = 0; i < str.length();i++){
            if (!checkarr.containsKey(str.charAt(i))){
                checkarr.put(str.charAt(i),1);

            }else{
                checkarr.put(str.charAt(i),checkarr.get(str.charAt(i))+1);
            }
        }
        for (int i = 0; i < str.length();i++){
            if (checkarr.get(str.charAt(i)) == 1 ){
                return i ;
            }
        }
        return 0;
    }
}
