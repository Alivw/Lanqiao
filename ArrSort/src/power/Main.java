package power;

/**
 * @Description: 倍数
 * @Author: Awei
 * @Create: 2021-03-26 19:36
 **/
public class Main {
    public static void main(String[] args) {
        long start = 1032, targ = 234, end = 12302135942453L;
        howManyNum(start, end, targ);
    }

    /**
     * —天蒜头君在想，[l,r][l,r]之间有多少个数字是dd的倍数呢?
     * 但是区间[I,r][,r]是dd 的倍数的数字太多，于是聪明的蒜头君便找到了你。
     * 当|=1032,r = 12302135942453，d = 234，d的倍数有多少个呢?
     *
     * @param start
     * @param end
     * @param targ
     */
    private static void howManyNum(long start, long end, long targ) {
        System.out.println(end/targ-start/targ);

    }


}
