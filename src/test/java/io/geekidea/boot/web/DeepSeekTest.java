package io.geekidea.boot.web;

import io.geekidea.boot.cat.service.DeepSeekService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author chenzeng
 * @version 0.0.1
 * @date 2025/3/20 00:13
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class DeepSeekTest {

    @Autowired
    private DeepSeekService deepSeekService;

    @Test
    public void test() {
        deepSeekService.testAsk();
    }

}