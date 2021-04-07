package com.awei.lanqiao.moni.wordanalyse;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Description: 单词分析:输出两行，第一行包含一个英文字母，表示单词中出现得最多的字母是哪个。如果有多个字母出现的次数相等，输出字典序最小的那个。  第二行包含一个整数，表示出现得最多的那个字母在单词中出现的次数。
 * @Author: Awei
 * @Create: 2021-04-07 22:09
 **/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] str = in.next().toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int max = 1;
        char result = 'a';
        for (int i = 0; i < str.length; i++) {
            int num;
            if (map.get(str[i])== null) {
                map.put(str[i], 1);
            } else {
                num = map.get(str[i]);
                map.put(str[i], ++num);
                if (num > max) {
                    max = num;
                    result = str[i];
                }

            }
        }

       /* for (Character ch : map.keySet()) {
            if (map.get(ch) > max) {
                max = map.get(ch);
                result = ch;
            }
        }*/
        System.out.println(result);
        System.out.println(max);
    }
}
