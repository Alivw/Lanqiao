package com.awei.lanqiao.moni.sortArr;

import java.util.Scanner;

/**
 * @Description: 第一行为一个整数n。第二行包含n个整数，为待排序的数,输出一行，按从小到大的顺序输出排序后的数列。
 * @Author: Awei
 * @Create: 2021-04-07 19:07
 **/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int[] result = cockTailSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    private static int[] cockTailSort(int[] arr) {
        int temp = 0;
        //奇数轮，从前往后
        for (int i = 0; i < arr.length / 2; i++) {
            boolean isSorted = true;
            for (int j = i; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) break;

            //偶数轮之前，重新设置是否有序
            isSorted = true;
            //偶数论，从后往前
            for (int j = arr.length - i - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted) break;
        }
        return arr;
    }
}
