package com.awei.moc.lights;

/**
 * @Description: 熄灯问题
 * @Author: Awei
 * @Create: 2021-03-28 19:43
 **/
public class Light {

    private byte[] oriLights = new byte[5];
    private byte[] lights = new byte[5];
    private byte[] result = new byte[5];
    static byte p = 8;
    /**
     * 取第 i 个 的 bit，i 从 右往左 ，i=1，为第1位
     *
     * @param p
     * @param i
     * @return
     */
    public int getBit(byte p, int i) {
        return (p >> i) & 1;
    }

    /**
     * 设置 p的 第 i位 为 v
     *
     * @param p
     * @param i
     * @param v
     */
    public void setBit(byte p, int i, int v) {
        if (v == 1) {
            p |= (0x1 << i-1);
            this.p = p;
            System.out.println(p);
        }else{
            p &= ~(0x1 << i-1);
            this.p = p;
        }

    }


    public static void main(String[] args) {
        Light light = new Light();

        light.setBit(p, 2, 1);
        System.out.println(p);
    }


}
