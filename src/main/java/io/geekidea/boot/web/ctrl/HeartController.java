package io.geekidea.boot.web.ctrl;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenzeng
 * @version 0.0.1
 * @date 2025/3/17 19:56
 */
@RestController
public class HeartController {

    @GetMapping("/firmware-versions")
    public String getFirmwarePublishHistory(
        @RequestParam(value = "deviceModel", required = false, defaultValue = "0") int deviceModel) {
        return "OK";
    }

}

