package com.awei.lanqiao.doorplate;

/**
 * @Author: Alivv
 * @Create: 2021-11-25 15:57
 **/
public class Main {


    /**
     * 小蓝要为一条街的住户制作门牌号。
     * 这条街一共有2020位住户，门牌号从1到2020编号。
     * 小蓝制作门牌的方法是先制作0到9这几个数字字符，最后根据需要将字符粘贴到门牌上，
     * 例如门牌1017需要依次粘贴字符1、0、1、7，即需要1个字符0，2个字符1，1个字符7。
     * 请问要制作所有的1到2020号门牌，总共需要多少个字符2？
     *
     * @param args
     */
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i < 2020; i++) {
            int temp = i + 1;
            while (temp > 0) {
                if (temp % 10 == 2) {
                    result++;
                }
                temp /= 10;
            }
        }

        System.out.println(result);
    }
}
