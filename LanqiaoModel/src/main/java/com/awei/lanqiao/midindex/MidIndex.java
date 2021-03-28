package com.awei.lanqiao.midindex;

/**
 * @Description: 中间索引
 * @Author: Awei
 * @Create: 2021-03-28 09:55
 **/
public class MidIndex {
    /**
     * 给定一个整数类型的数组 nums，要求编写一个能够返回数组 “中心索引” 的方法。
     * 数组的 中心索引 是这样定义的：数组中心索引的左侧所有元素相加的和 = 右侧所有元素相加的和。
     * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
     */

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 5, 6, 7, 2, 4, 5, 6};
        int result = f(arr);
        System.out.println(result);
    }

    private static int f(int[] arr) {
        int sum = 0, sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
            if (sum - sum1 - arr[i+1] == sum1) {
                return i + 1;
            }
        }
        return -1;
    }
}
