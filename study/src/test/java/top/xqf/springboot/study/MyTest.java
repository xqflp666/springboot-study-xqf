package top.xqf.springboot.study;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

@SpringBootTest
public class MyTest {
    private static Logger logger= LoggerFactory.getLogger(MyTest.class);
    @Test
    public void test() throws Exception{
        logger.debug("{},{},{}", StringUtils.hasText(null),StringUtils.hasText("   "),StringUtils.hasText("zzz"));
    }

}
