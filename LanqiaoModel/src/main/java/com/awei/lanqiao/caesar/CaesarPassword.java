package com.awei.lanqiao.caesar;

/**
 * @Description: 凯撒密码
 * @Author: Awei
 * @Create: 2021-03-29 08:10
 **/
public class CaesarPassword {
    public static void main(String[] args) {
        String str = "xyzabc";
        char[] chs = str.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] < 'x') {
                chs[i] += 3;
            } else chs[i] -= 23;
        }
        StringBuffer out = new StringBuffer();
        for (int i = 0; i < chs.length; i++) {
            out.append(chs[i] + "--");
        }
        System.out.println(out.substring(0, out.length() - 2));

    }


    public String reverseLeftWords(String s, int n) {
        return s.substring(n,s.length())+ s.substring(0,n+1);
    }
}
