package com.awei.lanqiao.moni.sum;

import java.util.Scanner;

/**
 * @Description: 求和
 * @Author: Awei
 * @Create: 2021-04-07 20:33
 **/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(f(in.nextInt()));;
    }

    private static int f(int i) {
        if (i == 1) {
            return 1;
        }
        return i + f(i - 1);
    }
}
