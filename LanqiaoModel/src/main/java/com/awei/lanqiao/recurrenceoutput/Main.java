package com.awei.lanqiao.recurrenceoutput;

import java.util.Scanner;

/**
 * @Description: 　编写递归函数，将组成整数的所有数字逐个输出，每个数字后面加上一个减号“-”，
 * 例如对于整数123，该函数将输出1-2-3- 。编写主函数测试该递归函数。
 * @Author: Awei
 * @Create: 2021-04-09 08:21
 **/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        f(num);
    }

    private static void f(int num) {
        if (num <= 0)
            return;
        f(num / 10);
        System.out.print(num%10+"-");
        System.out.println();
    }
}
