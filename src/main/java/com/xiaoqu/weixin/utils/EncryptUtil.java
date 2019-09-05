package com.xiaoqu.weixin.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class EncryptUtil {

    /**
     * MD5方法
     *
     * @param text 明文
     * @param key 密钥
     * @return 密文
     * @throws Exception
     */
    public static String md5(String text, String key) throws Exception {
        //加密后的字符串
        String encodeStr= DigestUtils.md5Hex(text + key);

        return encodeStr;
    }

    /**
     * sha256方法
     *
     * @param text 明文
     * @param key 密钥
     * @return 密文
     * @throws Exception
     */
    public static String sha256(String text, String key) throws Exception {
        //加密后的字符串
        String encodeStr= DigestUtils.sha256Hex(text + key);

        return encodeStr;
    }
}
