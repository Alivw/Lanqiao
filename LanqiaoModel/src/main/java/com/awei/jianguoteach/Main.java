package com.awei.jianguoteach;

import java.util.Arrays;

/**
 * @Description: 分治 归并
 * @Author: Awei
 * @Create: 2021-04-08 18:42
 **/
public class Main {

    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] temp = new int[arr.length];
        f(arr, 0, arr.length - 1, temp);
        System.out.println(Arrays.toString(arr));
    }

    private static void f(int[] arr, int start, int end, int[] temp) {
        if (start < end) {
            int mid = (start + end) / 2;
            f(arr, start, mid, temp);
            f(arr, mid + 1, end, temp);
            merge(arr, start, mid, end, temp);
        }
    }

    /**
     * 合并方法
     * @param arr
     * @param start
     * @param mid
     * @param end
     * @param temp
     */
    private static void merge(int[] arr, int start, int mid, int end, int[] temp) {
        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else temp[k++] = arr[j++];
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }
        int t = 0;
        while (start <= end) {
            arr[start++] = temp[t++];
        }
    }
}
