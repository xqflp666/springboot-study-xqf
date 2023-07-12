package top.xqf.springboot.study2;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

public class MyTest {
    private static Logger logger= LoggerFactory.getLogger(MyTest.class);

    @Test
    public void CS(){
        logger.debug("{},{},{}", StringUtils.hasText(null),StringUtils.hasText("     "),StringUtils.hasText("dfg"));
    }

}
