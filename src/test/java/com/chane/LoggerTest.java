package com.chane;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by chane on 2017/9/9.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggerTest {
    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void test1(){

        logger.debug("debug....");
        logger.info("info....");
        logger.error("errer...");

        //变量使用
        String name = "chane";
        String password = "123456";
        logger.info("name:"+name+",password:"+password);
        logger.info("name:{},password:{}",name,password);

    }
}
