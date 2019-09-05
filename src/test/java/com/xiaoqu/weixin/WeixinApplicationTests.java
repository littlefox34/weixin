package com.xiaoqu.weixin;


import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeixinApplicationTests {

    @Test
    public void contextLoads() {

    }

    @Test
    public void test(){
        String hashAlgorithmName = "MD5";
        ByteSource byteSource = ByteSource.Util.bytes("76b60f4b");

        String password = "foxer34";
        int hashhIteration = 2;
        SimpleHash result = new SimpleHash(hashAlgorithmName, password, byteSource, hashhIteration);
        System.out.println(result.toString());
    }

}
