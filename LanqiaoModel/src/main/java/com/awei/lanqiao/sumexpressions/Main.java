package com.awei.lanqiao.sumexpressions;

import java.util.Scanner;

/**
 * @Description:输入n, m, k，输出下面公式的值。
 * @Author: Awei
 * @Create: 2021-04-11 19:58
 **/
public class Main {
    static int n;
    static int m;
    static int k;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         n = in.nextInt();
         m = in.nextInt();
         k = in.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += zh(n, i) * ik(i, k);
        }
        System.out.println(sum*zh(n, m)  % 999101);

    }

    /**
     * 求n的阶乘
     * @param n
     * @return
     */
    public static long jc(int n) {
        if (n < 3) {
            return n;
        }
        return n * jc(n - 1);
    }

    /**
     * i 的 k 次方
     * @param i
     * @param k
     * @return
     */
    public static long ik(int i,int k) {
        long q = 1;
        for (int j = 0; j < k; j++) {
            q *= i;
        }
        return q;

    }

    /**
     * 求 Cn m 组合数
     * @param n
     * @param m
     * @return
     */
    public static long zh(int n, int m) {
        if (n == m) {
            return 1;
        }
        return jc(n) / (jc(m) * jc(n - m));
    }
}
