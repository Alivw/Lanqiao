package fbs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: 反倍数
 * @Author: Awei
 * @Create: 2021-03-27 23:15
 **/
public class FbsTest {


    /**
     *  给定三个整数 a, b, c，如果一个整数既不是 a 的整数倍也不是 b 的整数倍还不是 c 的整数倍，则这个数称为反倍数。
     * @param args
     */
    public static void main(String[] args) {
        int n = 31, a = 5, b = 3, c = 7, count = 0;
        List<Integer> isList = new ArrayList<>();
        List<Integer> isNotList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % a != 0 && i % b != 0 && i % c != 0) {
                count++;
                isList.add(i);
                continue;
            }
            isNotList.add(i);

        }
        System.out.println("满足条件的共有："+count);
        isList.forEach(integer -> System.out.print(integer+"=="));
        System.out.println("\n不满足条件的共有："+(n-count));
        isNotList.forEach(integer -> System.out.print(integer+"=="));


    }
}
