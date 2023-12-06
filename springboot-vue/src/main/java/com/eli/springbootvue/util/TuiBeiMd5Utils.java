package com.eli.springbootvue.util;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tangjinghua
 * @since 2023-11-14
 */
public class TuiBeiMd5Utils {
    /**
     * Used to build output as Hex
     */
    private static final char[] DIGITS_LOWER = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
        'e', 'f' };

    /**
     * 生成 md5 摘要
     * 
     * @param input
     *            字符串 * @return md5 摘要
     */
    public static String computeMD5(String input) {
        if (input == null) {
            return null;
        }
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("MD5");
            digest.update(input.getBytes("UTF-8"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        byte[] digestBytes = digest.digest();
        return new String(encodeHex(digestBytes));
    }

    private static char[] encodeHex(byte[] data) {
        int l = data.length;
        char[] out = new char[l << 1];
        // two characters form the hex value. 
        for (int i = 0, j = 0; i < l; i++) {
            out[j++] = DIGITS_LOWER[(0xF0 & data[i]) >>> 4];
            out[j++] = DIGITS_LOWER[0x0F & data[i]];
        }
        return out;
    }

    public static void main(String[] args) {
        List<String> aaa = new ArrayList<String>();
        aaa.add("2");
        aaa.add("a");
        aaa.add("g");
        System.out.println();
    }

}
