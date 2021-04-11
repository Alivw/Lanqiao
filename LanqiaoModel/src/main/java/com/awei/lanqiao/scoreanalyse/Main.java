package com.awei.lanqiao.scoreanalyse;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Description: 小蓝给学生们组织了一场考试，卷面总分为 100 分，每个学生的得分都是一个 0到100  的整数。  请计算这次考试的最高分、最低分和平均分。
 * @Author: Awei
 * @Create: 2021-04-11 10:33
 **/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] scores = new int[count];
        int max = 0, min = 100, avg = 0,sum=0;
        for (int i = 0; i < count; i++) {
            int score = in.nextInt();
            sum += score;
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
        }
        System.out.println(max);
        System.out.println(min);
        DecimalFormat df = new DecimalFormat("#.00");
        String result = df.format(sum / (count * 1.0));
        System.out.println(result);
    }
}
