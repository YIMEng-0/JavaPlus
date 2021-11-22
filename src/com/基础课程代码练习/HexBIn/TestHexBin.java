package com.基础课程代码练习.HexBIn;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/7/2 9:18 上午
 */
public class TestHexBin {

    public static void main(String[] args) {
        String str = "060A04000000C2";
        byte byteStr[] = parseHexStr2Byte(str);
        System.err.println("二进制结果：" + byteStr);

        // 十六进制的转换结果放在了函数中
        parseByte2HexStr(byteStr);
    }

    /**
     * 将二进制转换成16进制
     *
     * @param
     * @return
     */
    public static void parseByte2HexStr(byte buf[]) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < buf.length; i++) {
            String hex = Integer.toHexString(buf[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            sb.append(hex.toUpperCase());
        }
        System.out.println("二进制转换为十六进制的结果为：" + sb.toString());
    }

    /**
     * 将16进制转换为二进制
     *
     * @param
     * @return
     */
    public static byte[] parseHexStr2Byte(String hexStr) {
        if (hexStr.length() < 1)
            return null;
        byte[] result = new byte[hexStr.length() / 2];
        for (int i = 0; i < hexStr.length() / 2; i++) {
            int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
            int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2),
                    16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }
}
