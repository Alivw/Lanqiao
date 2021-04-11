package com.awei.letcode.ipaddress;

/**
 * @Description:给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 *
 * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
 * @Author: Awei
 * @Create: 2021-04-11 22:55
 **/
public class Main {
    public static void main(String[] args) {
        String str = defangIPaddr("192.168.0.1");
        System.out.println(str);

    }

    public static String defangIPaddr(String address) {
//        String[] strs = address.split("\\.");
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < strs.length; i++) {
//            if(i!=strs.length-1)
//                builder.append(strs[i] + "[.]");
//            else builder.append(strs[i]);
//        }
        return   address.replace(".", "[.]");
    }
}
