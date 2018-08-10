package com.example.Myleetcode.jianzhioffer;

import lombok.extern.slf4j.Slf4j;

/*
*在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
* 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。
* 即输出P%1000000007
* 示例：输入1,2,3,4,5,6,7,0 输出7
* */
@Slf4j
public class InversePairs_Merge {
    static int cnt = 0;
    public static void main(String[] args){
        int[] pair = {1,2,3,4,5,6,7,0};
         new InversePairs_Merge().mergeSortUp2Down(pair,0,pair.length);
        log.info("{},{}",pair,cnt);
    }


    public void  mergeSortUp2Down(int[] a, int start, int end) {
        if (start >= end) return;
        int mid = (start + end) >> 1;
        mergeSortUp2Down(a, start, mid);
        mergeSortUp2Down(a, mid + 1, end);
        merge(a, start, mid, end);
        }



 public void  merge(int[] a, int start, int mid, int end) {
            int[] tmp = new int[end - start + 1];
            int i = start, j = mid + 1, k = 0;
                while (i <= mid && j <= end) {
                    if (a[i] <= a[j])
                        tmp[k++] = a[i++];
                    else {
                            tmp[k++] = a[j++];
                            cnt += mid - i + 1; // core code, calculate InversePairs............
                        }
                }

                        while (i <= mid)
                                tmp[k++] = a[i++];
                        while (j <= end)
                                tmp[k++] = a[j++];
                        for (k = 0; k < tmp.length; k++)
                                a[start + k] = tmp[k];

    }
}
