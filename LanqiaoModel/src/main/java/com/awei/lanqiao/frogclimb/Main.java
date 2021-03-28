package com.awei.lanqiao.frogclimb;

/**
 * @Description:
 * @Author: Awei
 * @Create: 2021-03-26 19:03
 **/
public class Main {
    public static void main(String[] args) {
        int high = 60405, up = 105, down = 35;
        climb(high, up, down);
    }

    /**
     * 有一口深度为 high 米的水井，井底有一只青蛙，它每天白天能够沿井壁向上爬 up 米，夜里则顺井壁向下滑 down 米。
     * 若青蛙从某个早晨开始向外爬，当 high = 60405，up = 105，dow = 35，计算青蛙多少天能够爬出井口？
     * 注意：不能简单地认为每天上升的高度等于白天向上爬的距离减去夜间下滑的距离，因为若白天能爬出井口，则不必等到晚上。
     *
     * @param high
     * @param up
     * @param down
     */
    private static void climb(int high, int up, int down) {
        int s = 0, day = 0;
        while (true) {
            s += up;
            day++;
            if (s > high) {
                System.out.println(day);
                break;
            }
            s -= down;

        }
    }


}
