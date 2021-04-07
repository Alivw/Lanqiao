package com.awei.lanqiao.moni.combinestring;

import java.util.Scanner;

/**
 * @Description: 　输入两个字符串，将其合并为一个字符串后输出。
 * @Author: Awei
 * @Create: 2021-04-07 20:18
 **/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        builder.append(in.next());
        builder.append(in.next());
        System.out.println(builder.toString());
    }
}
