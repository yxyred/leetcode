package com.example.Myleetcode.jianzhioffer;

import lombok.extern.slf4j.Slf4j;

/*把只包含因子2、3和5的数称作丑数（Ugly Number）。
例如6、8都是丑数，但14不是，因为它包含因子7。
 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。*/
@Slf4j
public class GetUglyNumber {
    public static void main(String[] args) {
        int n = 10;
        int res = new GetUglyNumber().GetUglyNumberOfN(10);
        log.info("第{}个丑数是：{}",n,res);
    }
    public int GetUglyNumberOfN(int n){
        int count = 1,num = 1;
        while (count != n){
            num ++;
            if (CheckUglyNumber(num)) count++;
        }
        return num;
    }
    public boolean CheckUglyNumber(int n ){
        do {
            if (n % 2 == 0) n = n / 2;
            if (n % 5 == 0) n = n / 5;
            if (n % 3 == 0) n = n / 3;
        }while(n % 2 == 0 || n % 5 == 0 ||n % 3 == 0);
        if (n == 1) return true;
        return false;
    }
}
