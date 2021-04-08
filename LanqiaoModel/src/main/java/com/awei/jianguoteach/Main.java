package com.awei.jianguoteach;

import java.util.Arrays;

/**
 * @Description: 分治 归并
 * @Author: Awei
 * @Create: 2021-04-08 18:42
 **/
public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        int[] temp = new int[arr.length];
        int start=0, end = arr.length - 1;
        f(arr, start, end, temp);
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

    private static void merge(int[] arr, int start, int mid, int end, int[] temp) {
        int i = start;      //left point
        int j = mid + 1;        //right point
        int k = 0;      //temp  index
        while (i <= mid && j <= end) {      //两边都没有到头， 比较指针指向的值的大小
            if (arr[i] < arr[j])
                temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
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
