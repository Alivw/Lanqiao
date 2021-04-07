package com.awei.lanqiao.moni.binarysort;

import java.util.Scanner;

/**
 * @Description: 用递归函数实现二分法查找数组元素。
 * @Author: Awei
 * @Create: 2021-04-07 19:26
 **/
public class Main {
    public static void main(String[] args) {
        int[] data = new int[200];
        for (int i = 0; i < 200; i++) {
            data[i] = i * 4 + 6;
        }
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int low = 0, high = data.length;
        int index = binarySelect(data, low, data.length-1,num);
        System.out.println(index);
    }

    private static int binarySelect(int[] data, int low, int high, int key) {
        /*if(key < data[low] || key > data[high] || low > high){
            return -1;
        }
        int mid = (low + high) / 2;
        if(data[mid]<key)
            return binarySelect(data, mid + 1, high, key);
        else if (data[mid] > key) {
            return binarySelect(data, low, mid - 1, key);
        } else return mid;*/
        if (low <= high) {
            int mid = (low + high) / 2;
            if (data[mid] == key) {
                return mid;
            }
            if(data[mid]<key)
                return binarySelect(data, mid + 1, high, key);
            else return binarySelect(data, low, mid - 1, key);


        }
        return -1;

    }
}


