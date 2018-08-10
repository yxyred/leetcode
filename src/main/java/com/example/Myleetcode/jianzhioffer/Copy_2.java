package com.example.Myleetcode.jianzhioffer;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/*自动售货机里有 N 瓶复制可乐。复制可乐非常神奇，喝了它的人会复制出一个自己来！
现在有 Alice, Bob, Cathy, Dave 四个人在排队买复制可乐。买完的人会马上喝掉，
然后他和他的副本会重新去队伍的最后面排队买可乐。
问最后一个买到复制可乐的人叫什么名字？*/
@Slf4j
public class Copy_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if( n == 0){
            System.out.println(" ");
        }
        String res = new Copy_2().getName(n);
        log.info("{},{}",n,res);
    }
    public String getName(double n){
        String name = null;
        if (n>0 && n <=4){
            name = StringNameByNum(n);
            return name;
        }
       double res = Math.log((double)(n/4 +1)) / Math.log(2);
       int res_int = (int)(res);
       if (res >res_int){
           double  n1 =  n - 4*(Math.pow(2,res_int)-1);
           double n2 = n1/Math.pow(2,res_int);
           name = StringNameByNum(n2);
       }else{
           return "Dave";
       }
      return name;
    }
    public String StringNameByNum(double n2){
        if (n2 >0 && n2 <=1) return "Alice";
        if (n2 >1 && n2 <=2) return "Bob";
        if (n2 >2 && n2 <=3) return "Cathy";
        if (n2 >3 && n2 <=4) return "Dave";
        return null;
    }
}
