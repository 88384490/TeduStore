package md5;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

public class testMD5 {

    @Test
    public void testString() {
        String str1 = "123456";
        String str2 = "0987654321";
        String slat = "一切都是刚刚开始";

        String md5str1 = DigestUtils.md5Hex(str1);
        String md5str2 = DigestUtils.md5Hex(str2);

        System.out.println(md5str1);
        System.out.println(md5str2);
    }

    public void change(String str,char[] chs){
        str = "helloword";
        chs[0] = 'k';
    }

    @Test
    public void run(){
        String str = "hello";
        char[] chs = {'a','b','c'};
        change(str,chs);
        System.out.println(str);
        System.out.println(chs);
    }
}
