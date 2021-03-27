package zuhe;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 组合
 * @Author: Awei
 * @Create: 2021-03-27 23:47
 **/
public class ZhTest {
    static List<List<Integer>> reList = new ArrayList<>();
    static List<Integer> list = new ArrayList<>();
    static int n = 2;
    /**
     * 从一个集合中 随机挑选 n 个
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        f(arr, 0,0);
    }

    private static void f(int[] arr, int start,int size) {
        if (size == n) {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
            }
            System.out.println();
            reList.add(list);
            return;
        }
        for (int i = start; i < arr.length; i++) {
            list.add(arr[i]);
            size++;
            f(arr, i + 1,size);
            list.remove((Integer) arr[i]);
            size--;
        }
        return;
    }
}
