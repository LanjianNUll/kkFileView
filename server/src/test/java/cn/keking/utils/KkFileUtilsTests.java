package cn.keking.utils;

import org.junit.jupiter.api.Test;

public class KkFileUtilsTests {

    @Test
    void convertToValidFileName() {
        // 测试对URL中使用不合法的名称
        String in = "采访文章..\\\\../...pdf";
        String out = "采访文章.pdf";
        assert KkFileUtils.convertToValidFileName(in).equals(out);
    }
}
