package com.awei.lanqiao.moni.circleArea;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Description: 输入包含一个整数r，表示圆的半径。 输出格式 输出一行，包含一个实数，四舍五入保留小数点后7位，表示圆的面积。
 * @Author: Awei
 * @Create: 2021-04-07 19:18
 **/
public class Main {
    public static final double PI = 3.14159265358979323;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radis = in.nextInt();
        DecimalFormat df = new DecimalFormat("#.0000000");
        System.out.println(df.format(PI*radis*radis));
    }
}

