package com.hd.beast;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = BeastApplication.class)
@RunWith(SpringRunner.class)
//由于是web项目，junit需要模拟ServletContext,因此我们需要给我们的测试类加上webAppConfiguration
@WebAppConfiguration
class BeastApplicationTests {
    @Before
    public void init(){
        System.out.println("》》》》》》》》》》》》》》》》》》》》》开始测试--》》》》》》》》》》》》》》》》》》》》》");
    }

    @After
    public void after(){
        System.out.println("》》》》》》》》》》》》》》》》》》》》》测试结束--》》》》》》》》》》》》》》》》》》》》》");
    }
   /* @Test
    void contextLoads() {
    }*/

}
