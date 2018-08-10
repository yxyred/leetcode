package com.example.Myleetcode.jianzhioffer;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

/*把只包含因子2、3和5的数称作丑数（Ugly Number）。
例如6、8都是丑数，但14不是，因为它包含因子7。
 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。*/
@Slf4j
public class GetUglyNumber_produce {
    public static void main(String[] args) {
        int n = 1500;
        int res = new GetUglyNumber_produce().GetUglyNumberOfN(n);
        log.info("第{}个丑数是：{}",n,res);
    }
    public int GetUglyNumberOfN(int n){
        int count = 5,num = 0;
        if (n <= 5 ) return n;
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        while (count != n){
           array.add(array.get(num) * array.get(num +1));
           count ++;
           if (count == n) break;
            array.add(array.get(num) * array.get(num +2));
            count ++;
            if (count == n) break;
            array.add(array.get(num+1) * array.get(num +1));
            count ++;
            if (count == n) break;
            array.add(array.get(num) * array.get(num +3));
            count ++;
            if (count == n) break;
            num ++;
        }
        return array.get(array.size()-1);
    }

}
