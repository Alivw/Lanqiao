package com.awei.lanqiao.moni.shuixianhua;

/**
 * @Description: 水仙花
 * @Author: Awei
 * @Create: 2021-04-07 20:28
 **/
public class Main {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int a = i / 100;
            int b = i / 10 % 10;
            int c = i % 10;
            if (i == a * a * a + b * b * b + c * c * c) {
                System.out.println(i);
            }
        }
    }
}
