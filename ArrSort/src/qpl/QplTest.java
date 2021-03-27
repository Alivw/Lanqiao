package qpl;

import java.util.Arrays;

/**
 * @Description: 全排列
 * @Author: Awei
 * @Create: 2021-03-27 19:50
 **/
public class QplTest {
    private static int COUNT = 0;
    private static void swap(int[] c, int i, int j) {
        int temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    private static boolean swapAccepted(int[] arr, int s, int e) {
        for (int i = e+1; i < arr.length; i++) {
            if (arr[i] == arr[e]) return false;
        }
        return true;
    }

    private static void fullArray(int[] arr, int s, int length) {
        if (s == length - 1) {
            System.out.println(Arrays.toString(arr));
            COUNT++;
        }else{
            for (int i = s; i < length ; i++) {
                if (!swapAccepted(arr, s, i)) {
                    continue;
                }
                swap(arr,i,s);
                fullArray(arr, s + 1, length);
                swap(arr, i, s);
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2,3};
        fullArray(arr, 0, arr.length);
        System.out.println("共有：" + COUNT + "条记录");
    }
}
