package com.xiaoqu.weixin.utils;

import java.util.UUID;

public class RamdomUtil {
    public static String RamdomUUID()
    {
        return UUID.randomUUID().toString().replace("-","");
    }
}
