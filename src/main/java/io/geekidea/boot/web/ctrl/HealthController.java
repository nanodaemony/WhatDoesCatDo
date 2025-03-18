package io.geekidea.boot.web.ctrl;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenzeng
 * @version 0.0.1
 * @date 2025/3/17 19:56
 */
@Api(tags = "心跳检测")
@RestController()
public class HealthController {

    @GetMapping("/health")
    public String check() {
        return "I am always your father, my son!";
    }

}

